package com.springbootbasic.repository;

import java.util.List;
import java.util.Optional;

import com.springbootbasic.domain.Member;

//TODO
public class JdbcTemplateMemberRepository implements MemberRepository {

	//private final JdbcTemplate jdbcTemplate;
	
//	@Autowired
//	public JdbcTemplateMemberRepository( DataSource dataSource ) {
//		jdbcTemplate = new JdbcTemplate( dataSource );
//	}
	
	@Override
	public Member save(Member member) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Member> findById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Member> findByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Member> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

	
}
