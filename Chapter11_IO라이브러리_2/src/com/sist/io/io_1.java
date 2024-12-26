package com.sist.io;
/*
 * 
 *   라이브러리 => 9장~12장
 *   -------
 *    | 이해하는 것은 아니다 : 암기
 *     ---------------------
 *     1. 클래스명 : 사용처
 *     2. 주요메소드 => 역할 / 리턴형 / 매개변수
 *     3. 자바에서 지원 => 오버라이딩은 거의 없다
 *        ---------> 실무에서도 동일하게 사용 (표준화)
 *   
 *   1. 입출력 (파일에 쓰기 파일에 읽기) ==>358page
 *      => 메모리 입출력 (Scanner)
 *         =>System.out.println()
 *         =>System.in.read() 읽어올때 int로 받아들인다
 *         
 *      => 파일입출력
 *         InputStream  OutputStam
 *           (읽기)          (쓰기)
 *          ** 특징
 *             1) 단방향 통신을 한다=읽기쓰기를 동시에 처리하지 못한다
 *             2) Stream : 데이터 이동 통로
 *             3) 1byte 입출력
 *                 => 브라우저 / 한글이 없는 파일
 *              read() : 한글자씩 읽어온다
 *              write() : 한글자씩 저장
 *              close() : 닫기
 *           Reader     Writer => 2byte => 한글 읽기에 적합
 *             읽기        쓰기
 *            read()      write()     close()
 *            
 *          => 바이트스트림
 *             : 1byte송신 / 1byte수신 => 다운로드 , 업로드
 *          => 문자스트림
 *             : 2byte송신 / 2byte수신 => 한글 파일 제어
 *             FileReader / FileWriter
 *                 -------      ------
 *          => 필터스트림
 *          => 데이터를 메모리에 모아서 한번에 처리 : 속도
 *             BufferedInputStream / BufferedOutputStream
 *             BuffredReader / BufferedWriter
 *          ----------------------------------------------
 *          => 네트워크입출력
 *          
 *          입출력
 *               입력스트림         출력스트림
 *      	키보드 =====> 자바프로그램 =====> 모니터
 *                |			        |
 *                ~InputStream     OutputStream
 *                ~Reader          Writer
 *          ~InputSTream / ~ OutputStream
 *            =>이미지나 동여상 같은 바이트형태의 데이터 입출력
 *            => 업로드 / 다운로드
 *          ~Reader / ~Writer
 *            => 16bit(2byte) 문자 데이터를 입출력
 *            => 파일에 글쓰기 / 파일 읽어 온다
 *            
 *          메모리에 모아서 한번에 처리 => Buffered~
 *          
 *          => 객체단위로 저장
 *             ---------- 파일 프로그램 
 *          => 파일 => 데이터베이스 변경
 *          => 파일에 저장
 *             -------- Open API => 파싱된 것만 DB에 저장
 *             -------- DB에 들어가기 전에 크롤링 / 파일같은 경우 임시 저장 장소
 *             
 *             1. 데이터 종류
 *                1) 정형화된 데이터 : 필터링이 끝나서 데이터베이스에 저장할만한 데이터
 *                      => 웹 / 윈도우에 출력할 데이터만
 *                2) 반정형화된 데이터 : 구분만 된 데이터
 *                                  HTML/XML/JSON/CSV
 *                                  => API
 *                3) 비정형화된 데이터 : 구분이 없는 데이터
 *                                  뉴스 / 줄거리 / 댓글 등
 *                                  => 분석해서 필요한 데이터를 가지고 와서
 *                                     정형화된 데이터를 만듦
 *                                  -----------------------------
 *                                  비정형화된 데이터를 정형화된 데이터로 만드는
 *                                  과정을 빅데이터 라고 한다.
 *                                  빅데이터를 가지고 만든 것? AI
 *                                  => 정규식
 *         
 *         FileInputStream / FileOutputStream => 이미지/zip
 *         => CheckException => 예외처리가 필요
 *               |                  |               
 *              파일읽기            파일쓰기
 */               
import java.io.*;
public class io_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        FileInputStream fis=null;
		try
        {
        	//파일 읽기 => 358page
			fis=new FileInputStream("C:\\javaDV\\javastudy\\Chapter11_IO라이브러리_2\\src\\com\\sist\\io\\IO_1.java");
			// 숫자 / 알파벳은 => 상관없이 정상스럽다
			int i=0; // read() => int => 출력할때는 char로 변환
			while((i=fis.read())!=-1) //-1 파일이 끝나기전 = EOF
			{
				System.out.print((char)i);
			}
				
        }catch (Exception ex) {
			ex.printStackTrace();//오류 확인
		}
        finally
        {
        	try
        	{
        		fis.close();
        	}catch (Exception ex) {
				// TODO: handle exception
			}
        }
	}

}
