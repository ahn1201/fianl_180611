<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div class="content">
<!-- side menu -->
	<div class="side">
	<jsp:include page="/WEB-INF/views/admin/side/mainSide.jsp"/>
	</div>
	<div class="main" style="margin-left: 300px">
		<h3>공지사항 작성</h3>
		<form action="/admin/main/mainNoticeWrite.do" method="post" >
			<table class="table" style="width:1100px;">
				<tr>
				<td>
				<input type="hidden" name="board_writer" value="admin"/>	
				</td>
				</tr>
				<tr>
				<td>
				<input type="hidden" name="board_type" value="1"/>
				</td>
				</tr>
				<tr>
					<th>글 제목</th>
					<td><input type="text" name="board_title" id="board_title" /></td>
				</tr>
				<tr>
					<th>파일 업로드</th>
					<td><input type="file" name="board_file" id="board_file"/></td>
				</tr>
				<tr>
					<th>글 내용</th>
					<td>
					<textarea name="board_content"></textarea>

					</td>
				</tr>
				<tr>
					<td colspan="2"><button>제출</button></td>
				</tr>
			
			</table>

		</form>
	
	</div>
</div>
</body>
</html>