package org.example;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * 요구사항
 * 평균학점 계산방법 = (학점수*교과목 평점)의합계 / 수강신청 총학점수
 * 일급 컬렉션 사용
 */
public class GradeCalculatorTest {
    //학점 계산기 도메인 : 이수한 과목(객체지향 프로그래밍,자료구조,중국어 회화),학점 계산기 객체 필요
    //이수한 과목: 객체지향 프로그래밍,자료구조,중국어 회화 --> 과목(코스) 클래스로 표현할수있음:동적인객체를 정적인타입으로 추상화해서 도메인 모델링
    
    // 이수한 과목을 전달하여 평균학점 계산 요청 --> 학점 계산기 --> (학점수*교과목 평점)의 합계 --> 과목(코스)에게 요청할수있음
    //                                              --> 수강신청 총학점 수          -->과목(코스)에게 요청할수있음

    @DisplayName("평균 학점을 계산한다.")
    @Test
    void calculateGradeTest() {
        List<Course> course = List.of(new Course("OOP",3,"A+"),
                new Course("자료구조",3,"A+"));

        GradeCalculator gradeCalculator = new GradeCalculator(course);
        double gradeResult = gradeCalculator.calculateGrade();

        assertThat(gradeResult).isEqualTo(4.5);
    }
}
