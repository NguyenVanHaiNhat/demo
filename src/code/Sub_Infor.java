package code;

public class Sub_Infor extends Infor {
    public void method(){
//        super.a = 1; => không thể truy cập tại vì private chỉ sử dụng trong class
        super.b = 2; // => có thể truy cập vì default có thể truy cập trong package vì ở đây lớp con cũng ở cùng package
        super.c = 3; // => có thể truy cập vì protected có thể truy cập trong package
        super.d = 4; // => public thì dùng đc bất cứ đâu
    }
}
