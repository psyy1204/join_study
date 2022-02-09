package hello.hellospring.domain;

import javax.persistence.*;

@Entity
//이제부터 JPA가 관리하는 Entity
public class Member {

    @Id //pk, insert하면 DB에서 ID를 자동으로 생성해줌 ->identity라고 함
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "username")
    //DB에 name이 username으로 매핑
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
