package com.spring.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.stereotype.Repository;

import com.spring.model.Book;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public JdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(JdbcTemplate jdbctemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	//1.Insert Data
	@Override
	public int addBook(Book book) {
		String sql = "Insert into book(BookId , title) values (?,?)";
		return jdbcTemplate.update(sql,book.getBookId(),book.getTitle());
	}
	
	
	// 2. Update Book title
    public int updateBook(int BookId, String newTitle) {
        String sql = "UPDATE book SET title =? WHERE bookId =?";
        return jdbcTemplate.update(sql, newTitle, BookId);
    }

	@Override
	public int deleteBook(int bookId) {
		String sql="delete from book where bookId=?";
		return jdbcTemplate.update(sql,bookId);
	}

	@Override
	public List<Book> getAllBooks() {
		String sql="select * from book";
		return jdbcTemplate.query(sql,new RowMapper<Book>(){
			@Override
			public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
				return new Book(rs.getInt("bookId"),rs.getString("title"));
			}
			
		});
	}

	public Book getBook(int bookId) {
	    String sql = "SELECT * FROM book WHERE bookId = ?";
	    return jdbcTemplate.queryForObject(sql, new Object[] {bookId}, new BeanPropertyRowMapper<>(Book.class));
	}


	@Override
	public List<String> getAllBookTitles() {
		String sql="select title from book";
		
		return jdbcTemplate.queryForList(sql,String.class);
	}

	@Override
	public String getBookTitle(int bookId) {
		String sql = "SELECT title FROM book WHERE bookId = ?";
		return jdbcTemplate.queryForObject(sql, new Object[] {bookId},String.class);
	}

	

}
