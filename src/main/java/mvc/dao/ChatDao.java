package mvc.dao;

import mvc.dto.ChatDto;

public interface ChatDao {

	public void insertChat(ChatDto dto);
	public ChatDto selectChat(ChatDto dto);
	
}
