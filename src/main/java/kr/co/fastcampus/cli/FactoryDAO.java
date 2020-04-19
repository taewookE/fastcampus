package kr.co.fastcampus.cli;

public class FactoryDAO {
    public DAO createDAO(){
        return new DAO();
    }
}
