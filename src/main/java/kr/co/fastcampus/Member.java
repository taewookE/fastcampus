package kr.co.fastcampus;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor //기본생성자 자동 생성
@AllArgsConstructor //전체값 넣는 생성자 자동 생성
@RequiredArgsConstructor //필요 필드에 대한 생성자 생성 ( Nonull 어노테이션을 통해서 필요 값을 셋팅할 수 있다 )
public class Member {
    private int id;
    @NonNull private String userName;
    @NonNull private String passWord;

//    public Member(int id, String userName, String passWord) {
////        this.id = id;,
////        this.userName = userName;
////        this.passWord = passWord;
////    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", userName='" + userName + '\'' +
                ", passWord='" + passWord + '\'' +
                '}';
    }
}

 