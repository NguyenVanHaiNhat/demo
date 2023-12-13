package code;

public class Example {
    private Infor infor;
    public void method(){
//        this.infor.a = 1; => không thể truy cập tại vì private chỉ sử dụng trong class
        this.infor.b = 2; // => có thể truy cập vì default có thể truy cập trong package
        this.infor.c = 3; // => có thể truy cập vì protected có thể truy cập trong package và lớp con của nó thông qua tính kế thừa
        this.infor.d = 4; // => public thì dùng đc bất cứ đâu
    }
}
