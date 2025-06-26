package tannusit.spring_boot_sgate.repository;

import org.springframework.stereotype.Repository;

@Repository
public class PostRepository {
    public String getPost(){
        System.out.println("레포지토리까지 요청이 왔다감");
    return "레포지토리에서 보낸 어떤 게시물의 데이터";
    }
}
