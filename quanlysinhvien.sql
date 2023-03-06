--Tạo cơ sở dữ liệu quản lý sinh viên
drop database quanlysinhvien
Create database quanlysinhvien
Go
use quanlysinhvien
Go
--Tạo bảng Sinh Viên
Create table SINHVIEN(
MaSV nvarchar(10) not null primary key,
Cmnd char(12) not null unique,
HoTen nvarchar(50),
NgaySinh date,
GioiTinh nvarchar(3),
DiaChi nvarchar(50),
DanToc nvarchar(10),
TonGiao nvarchar(10) ,
NienKhoa nvarchar(10),
MaNganh nvarchar(10),
MaTK int
)
Go

-- Tạo bảng Học Phần
Create table HOCPHAN(
MaHP nvarchar(10) not null primary key,
TenMon nvarchar(50),
TinChi int ,
ChuyenBiet int,
PhanTramQuaTrinh nvarchar(10),
MaKhoa nvarchar(10),
MaNganh nvarchar(10)
)
Go
-- Tạo bảng điều kiện học phần
Create table DIEUKIEN(
MaHP nvarchar(10),
MaHP_Truoc nvarchar(10),
primary key(MaHP,MaHP_Truoc)

)
Go
--Taọ bảng Đăn ký môn học
create table NHOM(
MaHP nvarchar(10) not null,
SoNhom int not null,
HocKy int not null,
Nam int not null,
MaGV nvarchar(10),
Phong nvarchar(10),
SoSinhVien int ,
Thu nvarchar(10),
TietBD int,
SoTiet int,
primary key(MaHP,SoNhom,HocKy,Nam)
)
Go
--Tạo bảng Khoa
Create table KHOA(
MaKhoa nvarchar(10) not null primary key,
TenKhoa nvarchar(50),
MaTK int 
)
Go
--Tạo bảng Giảng Viên
Create table GIANGVIEN(
MaGV nvarchar(10) not null primary key,
TenGV nvarchar(50),
MaTK int
) 
Go
--Tạo bảng Kết Quả
Create table KETQUA(
MaSV nvarchar(10) not null,
MaHP nvarchar(10) not null,
SoNhom int not null,
HocKy int not null,
Nam int not null,
DiemQuaTrinh float,
DiemCuoiKy float,
Primary key(MaSV,MaHP,SoNhom,HocKy,Nam),
)
Go
--Tao bang Ngành
Create table NGANH(
MaNganh nvarchar(10) not null primary key,
TenNganh nvarchar(50),
MaKhoa nvarchar(10)
)
Go
--Tạo bảng Tài Khoản
Create table TAIKHOAN(
MaTK int not null primary key,
TenTaiKhoan nvarchar(10),
MatKhau nvarchar(50),
MaNhomQuyen nvarchar(10)
)
Go
--Taọ bảng nhóm quyền 
Create table NHOMQUYEN(
MaNhomQuyen nvarchar(10) not null primary key,
TenNhomQuyen nvarchar(50),
)
Go
--Tạo bảng chi tiết quyền
Create table CHITIETQUYEN(
MaQuyen nvarchar(10) not null primary key,
TenQuyen nvarchar(50),
MaNhomQuyen nvarchar(10)
)
Go
-- Tạo bảng nhóm quyền chi tiết quyền 
Create table NQ_CTQ(
MaNhomQuyen nvarchar(10),
MaQuyen nvarchar(10),
primary key(MaNhomQuyen,MaQuyen)
)

					-----====================== Thêm dữ liệu cho bảng ----======================
					-----======================		Nhóm Quyền	 ======================


					-----======================		Tài Khoản	 ======================
Insert into  TAIKHOAN values
(1,'admin','admin','Q1'),
(2,'CNTT','12345678','Q2'),
(3,'NN','12345678','Q2'),
(4,'GCCT','12345678','Q2'),
(5,'SPKHTN','12345678','Q2'),
(6,'QTKD','12345678','Q2'),
(7,'TCKT','12345678','Q2'),
(100,'3121410482','123456','Q4'),
(101,'3121410066','123456','Q4'),
(102,'3121410379','123456','Q4'),
(103,'3121410502','123456','Q4'),
(10,'11384','12345','Q3'),
(11,'11271','12345','Q3'),
(12,'10991','12345','Q3'),
(13,'11364','12345','Q3'),
(14,'10631','12345','Q3'),
(15,'20766','12345','Q3'),
(16,'11453','12345','Q3'),
(17,'11556','12345','Q3'),
(18,'11206','12345','Q3'),
(19,'11232','12345','Q3')







					-----======================		Sinh Vien	 ======================
set dateformat dmy
					---=== Ngành Công Nghệ Thông Tin ===---
Insert into SINHVIEN values
('3121410482','001002003001',N'Nguyễn Minh Thuận','04/09/2003','Nam',N'Tiền Giang','Kinh','Không','2021-2026','DCT','100'),
('3121410066','002002003002',N'Bùi Hông Bảo','01/02/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DCT','101'),
('3121410379','003002003003',N'Nguyễn Tiến Phát','03/04/2003','Nam',N'Quảng Ngãi','Kinh','Không','2021-2026','DCT','102'),
('3121410502','004002003004',N'Phan Huỳnh Minh Tiến','04/05/2003','Nam',N'Hà Nội','Kinh','Không','2021-2026','DCT','103'),
					---=== Ngành Kĩ Thuật Phần Mềm ===---
('3121560051','005002003005',N'Nguyễn Hoàng Luân','12/05/2001','Nam',N'TP.HCM','Kinh','Không','2019-2024','DKP','104'),
('3121560061','006002003006',N'Phạm Văn Nghĩa','14/05/2002','Nam',N'Đà nẵng','Kinh','Không','2020-2025','DKP','105'),
('3121560020','007002003007',N'Nguyễn Tiến Danh','22/05/2003','Nam',N'Huế','Kinh','Không','2021-2026','DKP','106'),
('3121560023','008002003008',N'Võ Khương Duy','26/03/2003','Nam',N'Bình Định','Kinh','Không','2021-2026','DKP','107'),
					---=== Ngành Ngôn Ngữ Anh ===---
('3121380077','009002003009',N'Trần Hương Giang','10/05/2002','Nữ',N'TP.HCM','Kinh','Không','2020-2025','DAN','108'),
('3121380238','010002003010',N'Phạm Ngân Quỳnh	','01/06/2003','Nữ',N'Long An','Kinh','Không','2021-2026','DAN','109'),
('3121380291','011002003011',N'Dương Ngọc Trâm','02/06/2001','Nữ',N'Cần Thơ','Kinh','Không','2019-2024','DAN','110'),
('3121380003','012002003012',N'Mai Thị Phương Nhi','04/08/2003','Nữ',N'An Giang','Kinh','Không','2021-2026','DAN','111'),
					---=== Ngành Kinh Doanh Quốc Tế ===---
('3121550056','013002003013',N'Hồ Thị Cẩm Nhung','05/11/2003','Nữ',N'An Giang','Kinh','Không','2021-2026','DKQ','112'),
('3121550026','013002003014',N'Trương Thị Mai Hân','08/01/2004','Nữ',N'Đồng Tháp','Kinh','Không','2022-2027','DKQ','113'),
('3121550059','013002003015',N'Huỳnh Ngọc Như','07/07/2002','Nữ',N'Phú Yên','Kinh','Không','2020-2025','DKQ','114'),
('3121550069','013002003016',N'Nguyễn Phương Oanh','08/09/2003','Nữ',N'Nghệ An','Kinh','Không','2021-2026','DKQ','115'),
					---=== Ngành Quản Trih Kinh Doanh ===---
('3121330094','013002003017',N'Ngô Lê Thành Đạt','09/06/2003','Nam',N'Hà Tĩnh','Kinh','Không','2021-2026','DQK','116'),
('3121330058','013002003018',N'Lê Minh Châu','11/02/2003','Nữ',N'TP.HCM','Kinh','Không','2020-2025','DQK','117'),
('3121330122','013002003019',N'Nguyễn Lê Ngọc Hân','22/05/2003','Nữ',N'Hà Nội','Kinh','Không','2022-2027','DQK','118'),
('3121330217','013002003020',N'Nguyễn Huyền My','25/04/2003','Nữ',N'Tây Ninh','Kinh','Không','2019-2024','DQK','119'),
					---=== Ngành Sư Phạm Tiếng Anh ===---
('3121130095','013002003021',N'Trần Nữ Minh Ngọc','01/09/2003','Nữ',N'Đà Nẵng','Kinh','Không','2021-2026','DSA','120'),
('3121130101','013002003022',N'Nguyễn Thị Yến Nhi','03/10/2002','Nữ',N'Lâm Đồng','Kinh','Không','2022-2026','DSA','121'),
('3121130104','013002003023',N'Nguyễn Quỳnh Như','01/11/2003','Nữ',N'TP.HCM','Kinh','Không','2021-2026','DSA','122'),
('3121130131','013002003024',N'Nguyễn Lê Hoàng Thi','07/09/2003','Nữ',N'Vũng Tàu','Kinh','Không','2021-2026','DSA','123'),
					---=== Ngành Tài Chính - Ngân Hàng ===---
('3121420071','013002003025',N'Nguyễn Thành Công','01/12/2003','Nam',N'Vũng Tàu','Kinh','Không','2021-2026','DTN','124'),
('3121420147','013002003026',N'Phạm Bá Huy','07/03/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DTN','125'),
('3121420351','013002003027',N'Trần Diễm Quỳnh','08/04/2003','Nữ',N'TP.HCM','Kinh','Không','2021-2026','DTN','126'),
('3121420482','013002003028',N'Phạm Mỹ Uyên','22/10/2003','Nữ',N'Hà Nội','Kinh','Không','2021-2026','DTN','127'),
					---=== Ngành Kế Toán ===---
('3121320137','013002003029',N'Nguyễn Thị Ngọc Huyền','04/12/2003','Nữ',N'Vũng Tàu','Kinh','Không','2022-2027','DTN','128'),
('3121320408','013002003030',N'Huỳnh Thanh Mai Thy','09/01/2003','Nữ',N'TP.HCM','Kinh','Không','2021-2026','DTN','129'),
('3121320355','013002003031',N'Nguyễn Thanh Thanh','18/03/2003','Nữ',N'TP.HCM','Kinh','Không','2021-2026','DTN','130'),
('3121320439','013002003032',N'Bùi Thị Ngọc Trâm','22/11/2003','Nữ',N'Hà Nội','Kinh','Không','2021-2026','DTN','131')




					-----======================		KHOA	 ======================
Insert into KHOA  values
('CNTT',N'Công Nghệ Thông Tin',2),
('NN',N'Ngoại Ngữ',3),
('GCCT',N'Giáo Dục Chính Trị',4),
('SPKHTN',N'Sư Phạm Khoa Học Tự Nhiên',5),
('QTKD',N'Quản Trị Kinh Doanh',6),
('TCKT',N'Tài Chính Kế Toán',7)




					-----======================		Ngành	 ======================
Insert into NGANH values
('DCT',N'Công Nghệ Thông Tin','CNTT'),
('DKP',N'Kĩ Thuật Phần Mềm','CNTT'),
('DAN',N'Ngôn Ngữ Anh','NN'),
('DSA','Sư Phạm Tiếng Anh','NN'),
('DQK','Quản Trị Kinh Doanh','QTKD'),
('DKQ','Kinh Doanh Quốc Tế','QTKD'),
('DSI','Sư Phạm Sinh Học','SPKHTN'),
('DKH',N'Sư Phạm Khoa Học Tự Nhiên','SPKHTN'),
('DLI',N'Sư Phạm Lí','SPKHTN'),
('DHO',N'Sư Hóa','SPKHTN'),
('DTN','Tài Chính - Ngân Hàng','TCKT'),
('DKE','Kế Toán','TCKT')

					-----======================		Giảng Viên	 ======================
Insert into GIANGVIEN values
('11384',N'Trương Tấn Khoa',10),
('11271',N'Nguyễn Thị Hồng Anh',11),
('10991',N'Nguyễn Thanh Sang',12),
('11364',N'Lương Minh Huấn',13),
('10631',N'Phan Tấn Quốc',14),
('20766',N'Huỳnh Minh Trí',15),
('11453',N'Nguyễn Tuấn Đăng',16),
('11556',N'Huỳnh Nguyễn Khắc Huy',17),
('11206',N'Nguyễn Thị Hương Giang',18),
('11232',N'Nguyễn Thị Lệ Giang',19)
select * from GIANGVIEN





					-----======================		END		======================

					-----====================== Thêm ràng buộc ----======================

				-----======================  Ràng buộc cho bảng Sinh Viên ----======================
				
Alter table SINHVIEN 
add constraint FK_SV_MaNganh_NGANH_MaNganh foreign key (MaNganh) references NGANH(MaNganh),
constraint FK_SV_MATK_TAIKHOAN_MaTK foreign key (MaTK) references TAIKHOAN(MaTK)


				-----======================  Ràng buộc cho bảng Khoa ----======================
Alter table KHOA
add constraint FK_KHOA_MATK_TAIKHOAN_MaTK foreign key (MaTK) references TAIKHOAN(MaTK)

				-----======================  Ràng buộc cho bảng GiangVien ----======================
Alter table GIANGVIEN
add constraint FK_GiangVien_MATK_TAIKHOAN_MaTK foreign key (MaTK) references TAIKHOAN(MaTK)
	
				-----======================  Ràng buộc cho bảng Học Phần ----======================

Alter table HOCPHAN 
add constraint FK_HOCPHAN_MaNganh_NGANH_MaNganh foreign key(MaNganh) references NGANH(MaNganh),
constraint FK_HOCPHAN_MaKhoa_KHOA_MaKhoa foreign key(MaKhoa) references KHOA(MaKhoa)

				-----======================  Ràng buộc cho bảng Điều Kiện ----======================
Alter table DIEUKIEN
add constraint FK_DIEUKIEN_MaHP_HOCPHAN_MaHP foreign key (MaHP) references HOCPHAN(MaHP),
constraint FK_DIEUKIEN_MaHPTRUOC_HOCPHAN_MaHP foreign key (MaHP_Truoc) references HOCPHAN(MaHP)


				-----======================  Ràng buộc cho bảng Nhóm----======================
Alter table NHOM
add constraint FK_NHOM_MaGV_GIANGVIEN_MaGV foreign key(MaGV) references GIANGVIEN(MaGV),
constraint FK_NHOM_MaHP_HOCPHAN_MaHP foreign key(MaHP) references HOCPHAN(MaHP)

				-----======================  Ràng buộc cho bảng Kết Quả ----======================
Alter table KETQUA
add constraint FK_KETQUA_MaSV_SINHVIEN_MaSV foreign key (MaSV) references SINHVIEN(MaSV),
constraint FK_KETQUA_MaHP_NHOM_MaHP foreign key (MaHP,SoNhom,HocKy,Nam) references NHOM(MaHP,SoNhom,HocKy,Nam)

				-----======================  Ràng buộc cho bảng Ngành ----======================
Alter table NGANH 
add constraint FK_NGANH_MaKhoa_KHOA_MaKhoa foreign key (MaKhoa) references KHOA(MaKhoa)

				-----======================  Ràng buộc cho bảng Tài Khoản ----======================

Alter table TAIKHOAN 
add constraint FK_TAIKHOAN_MaNhomQuyen_NHOMQUYEN_MaNhomQuyen foreign key(MaNhomQuyen) references NHOMQUYEN(MaNhomQUyen)

				-----======================  Ràng buộc cho bảng NQ_CTQ ----======================
Alter table NQ_CTQ
add constraint FK_NQ_CTQ_MaNhomQUyen_NHONQUYEN_MaNhonQuyen foreign key(MaNhomQuyen) references NHOMQUYEN(MaNhomQuyen),
constraint FK_NQ_CTQ_MaQuyen_CHITIETQUYEN_MaQuyen foreign key(MaQuyen) references CHITIETQUYEN(MaQuyen)

