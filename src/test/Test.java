package test;


import code.Infor;

public class Test {
    private Infor infor;
    public void method(){
//        this.infor.a = 1; => không thể truy cập tại vì private chỉ sử dụng trong class
//        this.infor.b = 2; => Không thể truy cập vì default chỉ truy cập bên trong package đc thôi
//        this.infor.c = 3; => Không thể truy cập vì lớp này không phải lớp con và protected chỉ truy cập bên trong package đc thôi
        this.infor.d = 4; // => public mà sai đâu mà chả được
    }

}
