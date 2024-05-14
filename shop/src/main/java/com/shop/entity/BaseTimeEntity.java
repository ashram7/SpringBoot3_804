package com.shop.entity;

import jakarta.persistence.EntityListeners;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

//Auditing을 적용하기 위해서 @EntityListensers 어노테이션을 추가
@EntityListeners(value = {AuditingEntityListener.class})
//공통 매핑 정보가 필요할 때 사용하는 어노테이션으로 부모 클래스를 상속 받는 자식 클래스에 매핑 정보만 제공
@MappedSuperclass
@Getter
@Setter
public class BaseTimeEntity {
}
