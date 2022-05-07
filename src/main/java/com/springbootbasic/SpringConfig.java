package com.springbootbasic;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbootbasic.repository.MemoryMemberRepository;
import com.springbootbasic.service.MemberService;

@Configuration
public class SpringConfig {

	/*
	 * 직접 스프링 빈 등록
	 * */
	@Bean
	public MemberService memberService() {
		return new MemberService( memberRepository() );
	}
	
	@Bean
	public MemoryMemberRepository memberRepository() {
		return new MemoryMemberRepository();
	}
}
