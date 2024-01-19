package com.sns.timeline.bo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.sns.timeline.domain.CardView;

@Service
public class TimelineBO { //화면용 객체를 가공하는 곳, DB와는 관련없다
	
	//input:X	output:List<CardView>
	public List<CardView> generateCardViewList() {
		List<CardView> cardViewList = new ArrayList<>();
		
		// 글 목록을 가져온다. List<PostEntity>
		
		// 글 목록 반복문 순회
		// post => cardView => cardViewList에 넣기
		
		return cardViewList;
	}
}
