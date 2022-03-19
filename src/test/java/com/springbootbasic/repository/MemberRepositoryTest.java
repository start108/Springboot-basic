package com.springbootbasic.repository;

import java.util.List;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import com.springbootbasic.domain.Member;

class MemberRepositoryTest {

	MemoryMemberRepository rp = new MemoryMemberRepository();
	
	// 테스트 순서는 보장되지 않으므로 메소드가 실행될 때 객체를 clear 되도록 afterEach() 메소드를 실행
	@AfterEach
	public void afterEach() {
		rp.clearStore(); 
	}
	
	@Test
	public void save() {
		
		Member mb = new Member();
		
		mb.setName("spring");
		
		rp.save(mb);
		
		Member result = rp.findById( mb.getId() ).get();
		
		Assertions.assertEquals( mb, result );
	}
	
	@Test
	public void findByName() {
		
		Member mb1 = new Member();
		mb1.setName( "spring1" );
		rp.save( mb1 );
		
		Member mb2 = new Member();
		mb2.setName( "spring2" );
		rp.save( mb2 );
		
		Member result = rp.findByName("spring1").get();

		Assertions.assertEquals( mb1.getName(), result.getName() );
	}
	
	@Test
	public void findAll() {
		
		Member mb1 = new Member();
		mb1.setName( "spring1" );
		rp.save( mb1 );
		
		Member mb2 = new Member();
		mb2.setName( "spring2" );
		rp.save( mb2 );
		
		List<Member> resultList = rp.findAll();
		
		Assertions.assertEquals( resultList.size(), 2 );
	}
}
