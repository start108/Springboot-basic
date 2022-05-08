package com.springbootbasic;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.springbootbasic.repository.JdbcTemplateMemberRepository;
import com.springbootbasic.repository.MemberRepository;
import com.springbootbasic.service.MemberService;

@Configuration
public class SpringConfig {

	private DataSource dataSource;
	
	@Autowired
	public SpringConfig( DataSource dataSource ) {
		this.dataSource = dataSource;
	}
	
	/*
	 * 직접 스프링 빈 등록
	 * */
	@Bean
	public MemberService memberService() {
		return new MemberService( memberRepository() );
	}
	
	@Bean
	public MemberRepository memberRepository() {
		//return new MemoryMemberRepository();
		return new JdbcTemplateMemberRepository( dataSource );
	}
}
