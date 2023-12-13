package test;

import code.Infor;

public class Sub_Infor2 extends Infor {
    public void method(){
//        super.a = 1; => không thể truy cập tại vì private chỉ sử dụng trong class
//        super.b = 2; => Không thể truy cập vì default chỉ truy cập bên trong package đc thôi
        super.c = 3; // => có thể truy cập vì protected có tính kế thừa lớp con của nó
        super.d = 4; // => public thì đi đâu mà chả dùng đc
    }
}
