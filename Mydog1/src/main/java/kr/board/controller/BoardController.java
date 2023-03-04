package kr.board.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.board.entity.Board;

@Controller
public class BoardController {
	
	// boardList.do (게시판 리스트좀 보여주세요 라는 요청)
	// HandlerMappping(요청을 받으려면 RequsetMapping) 
	@RequestMapping("/boardList.do")
	//메서드를 만들고 메서드를 실행
	public String boardList(Model model) {
		
		Board vo= new Board();
		vo.setIdx(1);
		vo.setTitle("테스트용도");
		vo.setContent("테스트용도");
		vo.setWriter("뚱이테스트");
		vo.setIndate("2022-05-10");
		vo.setCount(0);
		
		List<Board> list = new ArrayList<Board>();
		list.add(vo);
		list.add(vo);
		list.add(vo);
		
		model.addAttribute("list",list);
		
		return "boardList"; // /WEB-INF/view/boardList.jsp -> forward
	}
}
