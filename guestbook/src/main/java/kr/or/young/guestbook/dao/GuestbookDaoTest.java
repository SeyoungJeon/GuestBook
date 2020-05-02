package kr.or.young.guestbook.dao;

import java.util.Date;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import kr.or.young.guestbook.config.ApplicationConfig;
import kr.or.young.guestbook.dto.Guestbook;
import kr.or.young.guestbook.dto.Log;
public class GuestbookDaoTest {

	public static void main(String[] args) {
		ApplicationContext ac = new AnnotationConfigApplicationContext(ApplicationConfig.class); 
		GuestbookDao guestbookDao = ac.getBean(GuestbookDao.class);
		
//		Guestbook gb = new Guestbook();
//		gb.setName("전세영");
//		gb.setContent("반갑습니다. 여러분");
//		gb.setRegdate(new Date());
//		Long id = guestbookDao.insert(gb);
//		System.out.println("id : " + id);
		
		LogDao logDao = ac.getBean(LogDao.class);
		Log log = new Log();
		log.setIp("127.0.0.1");
		log.setMethod("insert");
		log.setRegdate(new Date());
		logDao.insert(log);
	}

}