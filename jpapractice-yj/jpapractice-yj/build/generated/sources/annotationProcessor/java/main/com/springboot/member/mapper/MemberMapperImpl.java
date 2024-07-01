package com.springboot.member.mapper;

import com.springboot.member.dto.MemberPostDto;
import com.springboot.member.dto.MemberResponseDto;
import com.springboot.member.entity.Member;
import javax.annotation.processing.Generated;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-07-01T10:44:00+0900",
    comments = "version: 1.4.2.Final, compiler: IncrementalProcessingEnvironment from gradle-language-java-7.4.1.jar, environment: Java 17.0.11 (Amazon.com Inc.)"
)
@Component
public class MemberMapperImpl implements MemberMapper {

    @Override
    public Member memberPostDtoToMember(MemberPostDto memberPostDto) {
        if ( memberPostDto == null ) {
            return null;
        }

        Member member = new Member();

        member.setName( memberPostDto.getName() );
        member.setEmail( memberPostDto.getEmail() );
        member.setPhone( memberPostDto.getPhone() );

        return member;
    }

    @Override
    public MemberResponseDto memberToMemberResponseDto(Member member) {
        if ( member == null ) {
            return null;
        }

        MemberResponseDto memberResponseDto = new MemberResponseDto();

        memberResponseDto.setName( member.getName() );
        memberResponseDto.setEmail( member.getEmail() );
        memberResponseDto.setPhone( member.getPhone() );
        memberResponseDto.setMemberStatus( member.getMemberStatus() );
        memberResponseDto.setCreatedAt( member.getCreatedAt() );

        return memberResponseDto;
    }
}
