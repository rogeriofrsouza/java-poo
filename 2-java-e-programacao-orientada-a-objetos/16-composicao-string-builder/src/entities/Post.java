package entities;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class Post {

	private LocalDateTime moment;
	private String title;
	private String content;
	private Integer likes;
	
	private List<Comment> comments = new ArrayList<>();
	
	// Uma instância para toda a aplicação
	private DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
	
	public Post() {
	}

	public Post(LocalDateTime moment, String title, String content, Integer likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public LocalDateTime getMoment() {
		return moment;
	}

	public void setMoment(LocalDateTime moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Integer getLikes() {
		return likes;
	}

	public void setLikes(Integer likes) {
		this.likes = likes;
	}

	public List<Comment> getComments() {
		return comments;
	}
	
	// Não adicionar um método set para uma coleção, senão a lista será trocada. Adicioner add() e remove()
	
	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	// Utilizar a classe StringBuilder -> mais otimizada e eficiente que muitas concatenações
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		// Concatena strings no final
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" likes - ");
		sb.append(moment.format(fmt) + "\n");
		sb.append(content + "\n");
		sb.append("Comments:\n");
		
		for (Comment c : comments) {
			sb.append(c.getText() + "\n");
		}
		
		return sb.toString();  // Converte o StringBuilder para String
	}
	
}
