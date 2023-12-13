# Access modifier
- Mức độ truy cập:
  + private: truy cập được trong class đc khai báo còn nếu muốn ở ngoài thì phải thông qua getter hoặc setter.
  + default: truy cập được bên trong package.
  + protected: truy cập được bên trong package và bên ngoài package thông qua lớp con của nó ( tính kế thừa ).
  + public: truy cập đâu cũng được.
- Sử dụng các Access modifier trong trường hợp nào
  + Private thì đc khuyến khích sử dụng cho các thông tin cần tính bảo mật và chính xác cao vì chỉ được chỉnh sửa thông qua phương thức getter hoặc setter thôi.
  + nếu không khai báo access modifier thì biến đó sẽ đc sử dụng ở trong toàn bộ trong package chứa class đc khai báo.
  + Protected thì liên quan đến lớp cha và lớp con thông qua tính kế thừa ( biến sẽ đc kế thừa lại thông qua tính kế thừa ).
  + Public thì liên quan đến những thông tin có thể thoải mái sử dụng hay là chỉnh sửa ( ví dụ như nickname tài khoản hay và các thông tin không quá bảo mật).

