<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<div class="d-flex justify-content-center">
	<div class="contents-box">

		<%-- 글쓰기 영역(로그인 된 사람만 보이게) --%>
		<c:if test="${not empty userId}">
		<div class="write-box border rounded m-3">
			<textarea id="writeTextArea" placeholder="내용을 입력해주세요" class="w-100 border-0"></textarea>
			
			<div class="d-flex justify-content-between">
				<div class="file-upload d-flex">
					<a href="#" id="fileUploadBtn"><img width="35" src="https://cdn4.iconfinder.com/data/icons/ionicons/512/icon-image-512.png"></a>
				</div>
				<button id="writeBtn" class="btn btn-info">게시</button>
			</div>
		</div> <%--// 글쓰기 영역 끝 --%>
		</c:if>
		
		<%-- 타임라인 영역 --%>
		<div class="timeline-box my-5">
			<%-- 카드1 --%>
			<div class="card border rounded mt-3">
				<%-- 글쓴이, 더보기(삭제) --%>
				<div class="p-2 d-flex justify-content-between">
					<span class="font-weight-bold">글쓴이</span>
					
					<a href="#" class="more-btn">
						<img src="https://www.iconninja.com/files/860/824/939/more-icon.png" width="30">
					</a>
				</div>	
				
				<%-- 카드 이미지 --%>
				<div class="card-img">
					<img src="https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMzA4MzBfMjM0%2FMDAxNjkzMzg1MzYwNjEw.MaqgbIFsumQhZjWjCwkuJ3Bhcg8E35BRh8Ds6tyqzYwg.QjzQlufJoJZdmAQPoTE8sDoPtz61KMVG4zIkBm6BWREg.PNG.cc64m7%2F4e234f6d-15d9-4479-b81f-e77342644713.png&type=a340" class="w-100" alt="본문 이미지">
				</div>
				
				<%-- 좋아요 --%>
				<div class="card-like m-3">
					<a href="#" class="like-btn">
						<img src="https://www.iconninja.com/files/214/518/441/heart-icon.png" width="18" height="18" alt="empty heart">
					</a>
					
					좋아요 13개
				</div>
				
				<%-- 글 --%>
				<div class="card-post m-3">
					<span class="font-weight-bold">글쓴이</span>
					<span>내 얼굴...</span>
				</div>
				
				<%-- 댓글 제목 --%>
				<div class="card-comment-desc border-bottom">
					<div class="ml-3 mb-1 font-weight-bold">댓글</div>
				</div>
				
				<%-- 댓글 목록 --%>
				<div class="card-comment-list m-2">
					<%-- 댓글 내용들 --%>
					<div class="card-comment m-1">
						<span class="font-weight-bold">댓글쓰니</span>
						<span>똑같다</span>
						
						<%-- 댓글 삭제 버튼 --%>
						<a href="#" class="comment-del-btn">
							<img src="https://www.iconninja.com/files/603/22/506/x-icon.png" width="10" height="10">
						</a>
					</div>
					
					<%-- 댓글 쓰기 --%>
					<div class="comment-write d-flex border-top mt-2">
						<input type="text" class="form-control border-0 mr-2 comment-input" placeholder="댓글 달기"/> 
						<button type="button" class="comment-btn btn btn-light">게시</button>
					</div>
				</div> <%--// 댓글 목록 끝 --%>
			</div> <%--// 카드1 끝 --%>
		</div> <%--// 타임라인 영역 끝  --%>
	</div> <%--// contents-box 끝  --%>
</div>