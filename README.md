# Quan ly thu vien sach 

# 03 đối tượng




## Các đối tượng quản lý sách  : 
```
1. Sách
Đối tượng Book đại diện cho mỗi cuốn sách có trong thư viện, bao gồm các thông tin như:
•	Id 
•	tenSach
•	tenTacGia
2. User (Người dùng)
Đối tượng User đại diện cho người sử dụng hệ thống (sinh viên, giảng viên,...), bao gồm:
•	Id 
•	Hoten
•	Tuoi
•	Gioitinh
•	LienHe
•	TaiKhoan
•	MatKhau

3. PhieuMuon (Phiếu mượn sách)
Đối tượng PhieuMuon dùng để ghi lại mỗi lần mượn sách, liên kết giữa người dùng và sách. Mỗi phiếu mượn bao gồm:
•	maPhieu
•	ngayMuon
•	ngayTra
•	Sach 

```
# Chi tiết kiểu mô tả của các đối tượng
```
Quản lí sách : 
Cập nhật thông tin sách: tên sách, tác giả, thể loại.

Cập nhật trạng thái sách khi người dùng mượn hoặc trả lại sách.

Cho phép người dùng xem danh sách các sách đang có sẵn để mượn.



Quản lí người dùng

Xem thông tin cá nhân.

Xem danh sách phiếu mượn đã tạo.

Thủ thư có thể tra cứu thông tin người dùng và lịch sử mượn sách của họ.

Quản lí phiếu mượn :
Đăng kí tài khoản người dùng mới

Tạo phiếu mượn mới: Khi người dùng chọn sách và thực hiện mượn, hệ thống sẽ tạo một phiếu mượn tương ứng.

Lưu thông tin phiếu mượn vào hệ thống để phục vụ việc tra cứu và quản lý.

Tự động cập nhật trạng thái sách thành "Đã mượn" khi phiếu được tạo.
```

## Class Diagram
![image](https://github.com/user-attachments/assets/4230702c-3deb-4d8d-847f-70bdb002ccbe)


## activity datagram 

![image](https://github.com/user-attachments/assets/517af5d5-7f59-4415-bba5-61a0efcdaaf9)

                 
## Sơ đồ thuật toán
![image](https://github.com/user-attachments/assets/d10beff7-8871-4a66-9715-d6c1ff3a5734)

``


 
## Giao diện hệ thống 
![image](https://github.com/user-attachments/assets/b15ac7ab-ace9-46c6-878b-807c38b5dc25)



