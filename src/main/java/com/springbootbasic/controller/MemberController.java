package com.springbootbasic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.springbootbasic.service.MemberService;

@Controller
public class MemberController {

	private final MemberService memberService;

	/*
	 * 필드 주입(DI)
	 * */
//	@Autowired private MemberService memberService;
	
	/*
	 * setter 주입(DI)
	 * */
//	@Autowired
//	public void setMemberService(MemberService memberService) {
//		this.memberService = memberService;
//	}
	
	/*
	 * 생성자 주입(DI)
	 * 의존관계가 실행 중에 동적으로 변하는 경우는 거의 없으므로 생성자 주입을 권장
	 * */
	@Autowired
	public MemberController(MemberService memberService) {
		this.memberService = memberService;
	}
}