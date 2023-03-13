--Tạo cơ sở dữ liệu quản lý sinh viên
--drop database quanlysinhvien
Create database quanlysinhvien
Go
use quanlysinhvien
Go
--Tạo bảng Sinh Viên
Create table SINHVIEN(
TrangThai int ,
MaSV nvarchar(10) not null primary key,
Cmnd char(12) not null unique,
SoDienThoai nvarchar(10),
HoTen nvarchar(50),
NgaySinh date,
GioiTinh nvarchar(3),
DiaChi nvarchar(50),
DanToc nvarchar(10),
TonGiao nvarchar(10) ,
NienKhoa nvarchar(10),
MaNganh nvarchar(10),
MaTK int,
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
TrangThai int,
MaGV nvarchar(10) not null primary key,
TenGV nvarchar(50),
MaTK int,
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
Insert into NHOMQUYEN values
('Q1','admin'),
('Q2','Khoa'),
('Q3','GiangVien'),
('Q4','SinhVien')
Insert into CHITIETQUYEN values
('','','')
					-----======================		Tài Khoản	 ======================
		
Insert into  TAIKHOAN values
(1,'admin','admin','Q1'),
(2,'CNTT','12345678','Q2'),
(3,'NN','12345678','Q2'),
(4,'GDCT','12345678','Q2'),
(5,'SPKHTN','12345678','Q2'),
(6,'QTKD','12345678','Q2'),
(7,'TCKT','12345678','Q2'),
(8,'QPAN&GDTC','12345678','Q2'),
(10,'11384','12345','Q3'),
(11,'11271','12345','Q3'),
(12,'10991','12345','Q3'),
(13,'11364','12345','Q3'),
(14,'10631','12345','Q3'),
(15,'20766','12345','Q3'),
(16,'11453','12345','Q3'),
(17,'11556','12345','Q3'),
(18,'11206','12345','Q3'),
(19,'11232','12345','Q3'),
(20,'20727','12345','Q3'),
(21,'11377','12345','Q3'),
(22,'11636','12345','Q3'),
(23,'20454','12345','Q3'),
(24,'11363','12345','Q3'),
(25,'11426','12345','Q3'),
(26,'20772','12345','Q3'),
(27,'10600','12345','Q3'),
(28,'20704','12345','Q3'),
(29,'11637','12345','Q3'),
(30,'10227','12345','Q3'),
(31,'11041','12345','Q3'),
(32,'20774','12345','Q3'),
(33,'10943','12345','Q3'),
(34,'11474','12345','Q3'),
(35,'20770','12345','Q3'),
(36,'10063','12345','Q3'),
(37,'11544','12345','Q3'),
(38,'10409','12345','Q3'),
(39,'11383','12345','Q3'),
(40,'10094','12345','Q3'),
(41,'11562','12345','Q3'),
(42,'10135','12345','Q3'),
(43,'11107','12345','Q3'),
(44,'11489','12345','Q3'),
(45,'10873','12345','Q3'),
(46,'10935','12345','Q3'),
(47,'10131','12345','Q3'),
(48,'10944','12345','Q3'),
(49,'20764','12345','Q3'),
(50,'20609','12345','Q3'),
(51,'10011','12345','Q3'),
(52,'20771','12345','Q3'),
(53,'10125','12345','Q3'),
(54,'11139','12345','Q3'),
(56,'11050','12345','Q3'),
(57,'10161','12345','Q3'),
(58,'10595','12345','Q3'),
(59,'11222','12345','Q3'),
(62,'10147','12345','Q3'),
(63,'11540','12345','Q3'),
(64,'11157','12345','Q3'),
(67,'11153','12345','Q3'),
(68,'11375','12345','Q3'),
(69,'10138','12345','Q3'),
(70,'10156','12345','Q3'),
(71,'10092','12345','Q3'),
(72,'10133','12345','Q3'),
(73,'11607','12345','Q3'),
(74,'11158','12345','Q3'),
(75,'11333','12345','Q3'),
(76,'11300','12345','Q3'),
(77,'10150','12345','Q3'),
(78,'10916','12345','Q3'),
(79,'11325','12345','Q3'),
(80,'11269','12345','Q3'),
(81,'10139','12345','Q3'),
(82,'10095','12345','Q3'),
(83,'10141','12345','Q3'),
(84,'11105','12345','Q3'),
(85,'11075','12345','Q3'),
(100,'3121410482','123456','Q4'),
(101,'3121410066','123456','Q4'),
(102,'3121410379','123456','Q4'),
(103,'3121410502','123456','Q4'),
(104,'3121560051','123456','Q4'),
(105,'3121560061','123456','Q4'),
(106,'3121560020','123456','Q4'),
(107,'3121560023','123456','Q4'),
(108,'3121380077','123456','Q4'),
(109,'3121380238','123456','Q4'),
(110,'3121380291','123456','Q4'),
(111,'3121380003','123456','Q4'),
(112,'3121550056','123456','Q4'),
(113,'3121550026','123456','Q4'),
(114,'3121550059','123456','Q4'),
(115,'3121550069','123456','Q4'),
(116,'3121330094','123456','Q4'),
(117,'3121330058','123456','Q4'),
(118,'3121330122','123456','Q4'),
(119,'3121330217','123456','Q4'),
(120,'3121130095','123456','Q4'),
(121,'3121130101','123456','Q4'),
(122,'3121130104','123456','Q4'),
(123,'3121130131','123456','Q4'),
(124,'3121420071','123456','Q4'),
(125,'3121420147','123456','Q4'),
(126,'3121420351','123456','Q4'),
(127,'3121420482','123456','Q4'),
(128,'3121320137','123456','Q4'),
(129,'3121320408','123456','Q4'),
(130,'3121320355','123456','Q4'),
(131,'3121320439','123456','Q4'),	
(132,'3121410533','123456','Q4'),
(133,'3121410046','123456','Q4'),
(134,'3121410062','123456','Q4'),
(135,'3121410069','123456','Q4'),
(136,'3121410077','123456','Q4'),
(137,'3121410091','123456','Q4'),
(138,'3131560020','123456','Q4'),
(139,'3121410123','123456','Q4'),
(140,'3132560023','123456','Q4'),
(141,'3120410601','123456','Q4'),
(142,'3121410562','123456','Q4'),
(144,'3121410569','123456','Q4'),
(145,'3121410313','123456','Q4'),
(146,'3121410585','123456','Q4'),
(147,'3122410068','123456','Q4'),
(148,'3122410264','123456','Q4'),
(149,'3121410106','123456','Q4'),
(150,'3121410087','123456','Q4'),
(151,'3121410070','123456','Q4'),
(152,'3121410079','123456','Q4'),
(153,'3121410491','123456','Q4'),
(154,'3121410522','123456','Q4'),
(155,'3121410559','123456','Q4'),
(156,'3121410401','123456','Q4')



					-----======================		Sinh Vien	 ======================
set dateformat dmy
					---=== Ngành Công Nghệ Thông Tin ===---
					
Insert into SINHVIEN values
(1,'3121410482','001002003001','0123456780',N'Nguyễn Minh Thuận','04/09/2003','Nam',N'Tiền Giang','Kinh','Không','2021-2026','DCT',100),
(1,'3121410066','002002003002','0123456781',N'Bùi Hông Bảo','31/03/2003','Nam',N'Tiền Giang','Kinh','Không','2021-2026','DCT',101),
(1,'3121410379','003002003003','0123456782',N'Nguyễn Tiến Phát','03/04/2003','Nam',N'Quảng Ngãi','Kinh','Không','2021-2026','DCT',102),
(1,'3121410502','004002003004','0123456783',N'Phan Huỳnh Minh Tiến','04/06/2003','Nam',N'Hà Nội','Kinh','Không','2021-2026','DCT',103),
(1,'3121410533','004002103014','0123456784',N'Nguyễn Thị Phương Trúc','24/03/2003','Nữ',N'Hà Nội','Kinh','Không','2021-2026','DCT',132),
(1,'3121410046','004002203010','0123456785',N'Huỳnh Dương Thái	An','25/03/2003','Nam',N'Hà Nội','Kinh','Không','2021-2026','DCT',133),
(1,'3121410062','004002303011','0123456786',N'Đinh Ngọc Ân','26/03/2003','Nam',N'Đà Nẵng','Kinh','Không','2021-2026','DCT',134),
(1,'3121410069','004002403012','0123456787',N'Hoàng Gia Bảo','24/03/2003','Nam',N'Đà Nẵng','Kinh','Không','2021-2026','DCT',135),
(1,'3121410077','004002503013','0123456788',N'Nguyễn Tùng Bảo','23/03/2003','Nam',N'Tiền Giang','Kinh','Không','2021-2026','DCT',136),
(1,'3121410091','004002603014','0123456789',N'Đỗ Nam Công Chính','22/03/2003','Nam',N'Tiền Giang','Kinh','Không','2021-2026','DCT',137),
(1,'3131560020','004002703010','0123456709',N'Nguyễn Tiến Thành','22/05/2003','Nam',N'Long An','Kinh','Không','2021-2026','DCT',138),
(1,'3121410123','004002803011','0123456719',N'Phan Quang Duy','01/05/2003','Nam',N'Long An','Kinh','Không','2021-2026','DCT',139),
(1,'3132560023','004003003012','0123456729',N'Võ Mạnh Quỳnh','02/05/2003','Nam',N'Quãng Ngãi','Kinh','Không','2021-2026','DCT',140),
(1,'3120410601','004003103013','0123456739',N'Phạm Phương Uyên','03/05/2003',N'Nữ',N'Quãng Ngãi','Kinh','Không','2021-2026','DCT',141),
(1,'3121410562','004003203014','0123456749',N'Tăng Quốc Tuấn','04/05/2003',N'Nam',N'Phú Yên','Kinh','Không','2021-2026','DCT',142),
(1,'3121410569','004003303010','0123456759',N'Hoàng Thị Tuyết','05/05/2003',N'Nữ',N'Phú Yên','Kinh','Không','2021-2026','DCT',144),
(1,'3121410313','004003403010','0123456769',N'Huỳnh Ngọc Diễm Ly','06/05/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DCT',145),
(1,'3121410585','004003503010','0123456779',N'Nguyễn Yến Vy','07/05/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DCT',146),
(1,'3122410068','004003603010','0123456789',N'Thạch Thị Hồng Đào','08/05/2003',N'Nữ',N'Nam Định','Kinh','Không','2021-2026','DCT',147),
(1,'3122410264','004003703010','0123456799',N'Trần Thị Kim	Ngọc','09/05/2003',N'Nữ',N'Nam Định','Kinh','Không','2021-2026','DCT',148),
(1,'3121410106','004003803011','0123456089',N'Nguyễn Tiến Duẩn','10/05/2003','Nam',N'Long An','Kinh','Không','2021-2026','DCT',149),
(1,'3121410087','004003903011','0123456189',N'Mai Trung Chỉnh','01/06/2003','Nam',N'Long An','Kinh','Không','2021-2026','DCT',150),
(1,'3121410070','004004003011','0123456289',N'Hoàng Gia Bảo','02/06/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DCT',151),
(1,'3121410079','004004103011','0123456389',N'Tiết Gia	Bảo','03/06/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DCT',152),
(1,'3121410491','004004203011','0123456489',N'Bùi Ngọc	Thức','04/06/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DCT',153),
(1,'3121410522','004004303011','0123456589',N'Ngô Hoàng Minh Trí','05/06/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DCT',154),
(1,'3121410559','004004403011','0123456689',N'Nguyễn Minh Tuấn','06/06/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DCT',155),
(1,'3121410401','004004503011','0123456789',N'Trần Như Phú	Quang','07/06/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DCT',156),
					---=== Ngành Kĩ Thuật Phần Mềm ===---
(1,'3121560051','005002003005','0123456889',N'Nguyễn Hoàng Luân','12/05/2001','Nam',N'TP.HCM','Kinh','Không','2019-2024','DKP',104),
(1,'3121560061','006002003006','0123456989',N'Phạm Văn Nghĩa','14/05/2002','Nam',N'Đà nẵng','Kinh','Không','2020-2025','DKP',105),
(1,'3121560020','007002003007','0123450789',N'Nguyễn Tiến Danh','22/05/2003','Nam',N'Huế','Kinh','Không','2021-2026','DKP',106),
(1,'3121560023','008002003008','0123451789',N'Võ Khương Duy','26/03/2003','Nam',N'Bình Định','Kinh','Không','2021-2026','DKP',107),
					---=== Ngành Ngôn Ngữ Anh ===---
(1,'3121380077','009002003009','0123452789',N'Trần Hương Giang','10/05/2002',N'Nữ',N'TP.HCM','Kinh','Không','2020-2025','DAN',108),
(1,'3121380238','010002003010','0123453789',N'Phạm Ngân Quỳnh	','01/06/2003',N'Nữ',N'Long An','Kinh','Không','2021-2026','DAN',109),
(1,'3121380291','011002003011','0123454789',N'Dương Ngọc Trâm','02/06/2001',N'Nữ',N'Cần Thơ','Kinh','Không','2019-2024','DAN',110),
(1,'3121380003','012002003012','0123455789',N'Mai Thị Phương Nhi','04/08/2003',N'Nữ',N'An Giang','Kinh','Không','2021-2026','DAN',111),
					---=== Ngành Kinh Doanh Quốc Tế ===---
(1,'3121550056','013002003013','0123456789',N'Hồ Thị Cẩm Nhung','05/11/2003',N'Nữ',N'An Giang','Kinh','Không','2021-2026','DKQ',112),
(1,'3121550026','013002003014','0123457789',N'Trương Thị Mai Hân','08/01/2004',N'Nữ',N'Đồng Tháp','Kinh','Không','2022-2027','DKQ',113),
(1,'3121550059','013002003015','0123458789',N'Huỳnh Ngọc Như','07/07/2002',N'Nữ',N'Phú Yên','Kinh','Không','2020-2025','DKQ',114),
(1,'3121550069','013002003016','0123459789',N'Nguyễn Phương Oanh','08/09/2003',N'Nữ',N'Nghệ An','Kinh','Không','2021-2026','DKQ',115),
					---=== Ngành Quản Trih Kinh Doanh ===---
(1,'3121330094','013002003017','0123406789',N'Ngô Lê Thành Đạt','09/06/2003','Nam',N'Hà Tĩnh','Kinh','Không','2021-2026','DQK',116),
(1,'3121330058','013002003018','0123416789',N'Lê Minh Châu','11/02/2003',N'Nữ',N'TP.HCM','Kinh','Không','2020-2025','DQK',117),
(1,'3121330122','013002003019','0123426789',N'Nguyễn Lê Ngọc Hân','22/05/2003',N'Nữ',N'Hà Nội','Kinh','Không','2022-2027','DQK',118),
(1,'3121330217','013002003020','0123436789',N'Nguyễn Huyền My','25/04/2003',N'Nữ',N'Tây Ninh','Kinh','Không','2019-2024','DQK',119),
					---=== Ngành Sư Phạm Tiếng Anh ===---
(1,'3121130095','013002003021','0123446789',N'Trần Nữ Minh Ngọc','01/09/2003',N'Nữ',N'Đà Nẵng','Kinh','Không','2021-2026','DSA',120),
(1,'3121130101','013002003022','0123456789',N'Nguyễn Thị Yến Nhi','03/10/2002',N'Nữ',N'Lâm Đồng','Kinh','Không','2022-2026','DSA',121),
(1,'3121130104','013002003023','0123466789',N'Nguyễn Quỳnh Như','01/11/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DSA',122),
(1,'3121130131','013002003024','0123476789',N'Nguyễn Lê Hoàng Thi','07/09/2003',N'Nữ',N'Vũng Tàu','Kinh','Không','2021-2026','DSA',123),
					---=== Ngành Tài Chính - Ngân Hàng ===---
(1,'3121420071','013002003025','0123486789',N'Nguyễn Thành Công','01/12/2003','Nam',N'Vũng Tàu','Kinh','Không','2021-2026','DTN',124),
(1,'3121420147','013002003026','0123496789',N'Phạm Bá Huy','07/03/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DTN',125),
(1,'3121420351','013002003027','0123056789',N'Trần Diễm Quỳnh','08/04/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DTN',126),
(1,'3121420482','013002003028','0123156789',N'Phạm Mỹ Uyên','22/10/2003',N'Nữ',N'Hà Nội','Kinh','Không','2021-2026','DTN',127),
					---=== Ngành Kế Toán ===---
(1,'3121320137','013002003029','0123256789',N'Nguyễn Thị Ngọc Huyền','04/12/2003',N'Nữ',N'Vũng Tàu','Kinh','Không','2022-2027','DTN',128),
(1,'3121320408','013002003030','0123356789',N'Huỳnh Thanh Mai Thy','09/01/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DTN',129),
(1,'3121320355','013002003031','0123456789',N'Nguyễn Thanh Thanh','18/03/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DTN',130),
(1,'3121320439','013002003032','0123556789',N'Bùi Thị Ngọc Trâm','22/11/2003',N'Nữ',N'Hà Nội','Kinh','Không','2021-2026','DTN',131),
					---=== Ngành Sư Phạm Khoa Học TN ===---
										

(1,'3122210001','013002003033','0123656789',N'Lê Thế Anh','19/8/2004','Nam',N'TP.HCM','Kinh','Không','2022-2027','DKH',132),
(1,'3122210002','013002003034','0123756789',N'Đặng Bảo Châu','22/1/2004',N'Nữ',N'TP.HCM','Kinh','Không','2022-2027','DKH',133),
(1,'3122210003','013002003035','0123856789',N'Lương Thế Hào','11/2/2004','Nam',N'TP.HCM','Kinh','Không','2022-2027','DKH',134),
(1,'3120210001','013002003036','0123956789',N'Lê Thị Trâm Anh','12/5/2002',N'Nữ',N'Hà Nội','Kinh','Không','2020-2025','DKH',135),
(1,'3120210002','013002003037','0120456789',N'Nguyễn Trần Vy Anh','21/2/2002',N'Nữ',N'TP.HCM','Kinh','Không','2020-2025','DKH',136),
(1,'3120210011','013002003038','0121456789',N'Võ Thụy Thiên Hà','1/6/2002',N'Nữ',N'TP.HCM','Kinh','Không','2020-2025','DKH',137),
(1,'3120210030','013002003039','0122456789',N'Nguyễn Minh Thành','2/8/2002',N'Nam',N'TP.HCM','Kinh','Không','2020-2025','DKH',138),
(1,'3120210017','013002003040','0123456789',N'Ngô Hoàng Thiện Khang','11/8/2002','Nam',N'TP.HCM','Kinh','Không','2020-2025','DKH',139),
(1,'3121210003','013002003041','0124456789',N'Trần Phương An','21/9/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DKH',140),
(1,'3121210013','013002003042','0125456789',N'Ngô Gia Hồng','21/9/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DKH',141),
					---=== Ngành Sư Phạm Lý  ===---
				
(1,'3122020001','013002003043','0126456789',N'Nguyễn Tấn Bình','2/10/2004','Nam',N'Hà Nội','Kinh','Không','2022-2027','DLI',142),
(1,'3121020005','013002003044','0127456789',N'Nguyễn Mạnh Cường','19/12/2004','Nam',N'Hà Nội','Kinh','Không','2022-2027','DLI',143),
(1,'3122020005','013002003045','0128456789',N'Mai Cẩm Hương','2/5/2004',N'Nữ',N'TP.HCM','Kinh','Không','2022-2027','DLI',144),
(1,'3122020007','013002003046','0123945678',N'Nguyễn Phạm Hoàng Lộc','1/12/2004','Nam',N'Hà Nội','Kinh','Không','2022-2027','DLI',145),
(1,'3121020001','013002003047','0120456789',N'Lê Thanh An','2/9/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DLI',146),
(1,'3121020003','013002003048','0121456789',N'Bùi Đình Thái Bảo','6/9/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DLI',147),
(1,'3121020017','013002003049','0122456789',N'Chung Mỹ Ngân','6/11/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DLI',148),
(1,'3121020032','013002003050','0123456789',N'Trần Trung Tính','1/4/2003',N'Nam',N'TP.HCM','Kinh','Không','2021-2026','DLI',149),
(1,'3120020001','013002003051','0124456789',N'Nguyễn Thị Tú Anh','5/1/2002',N'Nữ',N'TP.HCM','Kinh','Không','2020-2025','DLI',150),
(1,'3120020007','013002003052','0125456789',N'Chu Phúc Điền','5/6/2002','Nam',N'TP.HCM','Kinh','Không','2020-2025','DLI',151),
					--=== Ngành Sư Phạm Hóa ===---
(1,'3122030001','013002003053','0126456789',N'Ngô Thị Ngọc Anh','11/2/2004',N'Nữ',N'Hà Nội','Kinh','Không','2022-2027','DHO',152),
(1,'3122030003','013002003054','0127456789',N'Lê Gia Bảo','25/7/2004','Nam',N'TP.HCM','Kinh','Không','2022-2027','DHO',153),
(1,'3122030004','013002003055','0128456789',N'Lại Thị Ánh Dương','18/2/2004',N'Nữ',N'TP.HCM','Kinh','Không','2022-2027','DHO',154),
(1,'3122030006','013002003056','0123945678',N'Phạm Anh Khoa','6/7/2004','Nam',N'TP.HCM','Kinh','Không','2022-2027','DHO',155),
(1,'3121030002','013002003057','0120456789',N'Nguyễn Minh Anh','12/1/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DHO',156),
(1,'3121030003','013002003058','0121456789',N'Đỗ Thanh Bình','4/5/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DHO',157),
(1,'3121030007','013002003059','0122456789',N'Cao Nhật Duy','15/3/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DHO',158),
(1,'3121030018','013002003060','0123456789',N'Phạm Thị Hồng Nhi','12/12/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DHO',159),
(1,'3121030024','013002003061','0124456789',N'Bùi Anh Tú','18/3/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DHO',160),
(1,'3121030026','013002003062','0125456789',N'Trần Lê Vy','27/7/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DHO',161),
					--=== Ngành Sư Phạm Sinh ===---
(1,'3122060002','013002003063','0126456789',N'Hoàng Thanh Bình','2/11/2004','Nam',N'TP.HCM','Kinh','Không','2022-2027','DSI',162),
(1,'3122060009','013002003064','0127456789',N'Huỳnh Ngọc Yến Như','12/6/2004',N'Nữ',N'TP.HCM','Kinh','Không','2022-2027','DSI',163),
(1,'3122060011','013002003065','0128456789',N'Mai Nguyễn Xuân Quỳnh','5/10/2004',N'Nữ',N'TP.HCM','Kinh','Không','2022-2027','DSI',164),
(1,'3122060017','013002003066','0129456789',N'Nguyễn Anh Tuấn','14/1/2004','Nam',N'TP.HCM','Kinh','Không','2022-2027','DSI',165),
(1,'3121060001','013002003067','0103456789',N'Nguyễn Thị Lan Anh','3/6/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DSI',166),
(1,'3121060003','013002003068','0113456789',N'Lê Thị Hồng Diễm','12/12/2003',N'Nữ',N'Hà Nội','Kinh','Không','2021-2026','DSI',167),
(1,'3121060004','013002003069','0123456789',N'Ngô Nhật Duy','5/9/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DSI',168),
(1,'3121060015','013002003070','0133456789',N'Phạm Minh Mẫn','16/1/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DSI',169),
(1,'3121060017','013002003071','0143456789',N'Trần Thị Kim Ngân','28/8/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DSI',170),
(1,'3121060021','013002003072','0153456789',N'Từ Uyển Nhi','19/3/2003',N'Nữ',N'TP.HCM','Kinh','Không','2021-2026','DSI',171),
(1,'3121060026','013002003073','0163456789',N'Trần Quốc Thái','28/1/2003','Nam',N'TP.HCM','Kinh','Không','2021-2026','DSI',172)



					-----======================		KHOA	 ======================
Insert into KHOA  values
('CNTT',N'Công Nghệ Thông Tin',2),
('NN',N'Ngoại Ngữ',3),
('GDCT',N'Giáo Dục Chính Trị',4),
('SPKHTN',N'Sư Phạm Khoa Học Tự Nhiên',5),
('QTKD',N'Quản Trị Kinh Doanh',6),
('TCKT',N'Tài Chính Kế Toán',7),
('QPAN&GDTC',N'Giáo Dục Quốc Phòng An Ninh và Giáo Dục Thể Chất',8)




					-----======================		Ngành	 ======================
Insert into NGANH values
('DCT',N'Công Nghệ Thông Tin','CNTT'),
('DKP',N'Kĩ Thuật Phần Mềm','CNTT'),
('DAN',N'Ngôn Ngữ Anh','NN'),
('DSA',N'Sư Phạm Tiếng Anh','NN'),
('DQK',N'Quản Trị Kinh Doanh','QTKD'),
('DKQ',N'Kinh Doanh Quốc Tế','QTKD'),
('DSI',N'Sư Phạm Sinh Học','SPKHTN'),
('DKH',N'Sư Phạm Khoa Học Tự Nhiên','SPKHTN'),
('DLI',N'Sư Phạm Lí','SPKHTN'),
('DHO',N'Sư Phạm Hóa','SPKHTN'),
('DTN',N'Tài Chính - Ngân Hàng','TCKT'),
('DKE',N'Kế Toán','TCKT')


					-----======================		Giảng Viên	 ======================
Insert into GIANGVIEN values
(1,'11384',N'Trương Tấn Khoa',10),
(1,'11271',N'Nguyễn Thị Hồng Anh',11),
(1,'10991',N'Nguyễn Thanh Sang',12),
(1,'11364',N'Lương Minh Huấn',13),
(1,'10631',N'Phan Tấn Quốc',14),
(1,'20766',N'Huỳnh Minh Trí',15),
(1,'11453',N'Nguyễn Tuấn Đăng',16),
(1,'11556',N'Huỳnh Nguyễn Khắc Huy',17),
(1,'11541',N'Phan Nguyệt Minh',18),
(1,'20666',N'Trần Sơn Hải',19),
(1,'20727',N'Nguyễn Hữu Quang',20),
(1,'11377',N'Nguyễn Trung Tín',21),
(1,'11636',N'Từ Lãng Phiêu',22),
(1,'20454',N'Trần Công Hùng',23),
(1,'11363',N'Lê Thị Nhãm Thúy',24),
(1,'11426',N'Phạm Thị Vương',25),
(1,'20772',N'Võ Hoàng Hải',26),
(1,'10600',N'Nguyễn Quốc Huy',27),
(1,'20704',N'Nguyễn Tấn Công',28),
(1,'11637',N'Nguyễn Lê Thanh Trúc',29),
(1,'10227',N'Phùng Thái Thiên Trang',30),
(1,'11041',N'Đỗ Ngọc Như Loan',31),
(1,'20774',N'Hồ Đắc Quán',32),
(1,'10943',N'Nguyễn Hòa',33),
(1,'11474',N'Vũ Ngọc Thanh Sang',34),
(1,'20239',N'Vũ Thanh Hiền',34),
(1,'20770',N'Trần Thanh Nhã',35),
(1,'10063',N'Lai Đình Khải',36),
(1,'11544',N'Hà Thanh Dũng',37),
(1,'10409',N'Phạm Hoàng Vương',38),
(1,'11383',N'Trịnh Tấn Đạt',39),
(1,'10094',N'Cổ Tồn Minh Đăng',40),
(1,'11562',N'Nguyễn Quốc Phong',41),
(1,'10135',N'Trần Thanh Bình',42),
(1,'11107',N'Lê Minh Tuấn',43),
(1,'11489',N'Trần Đức Thành',44),
(1,'10873',N'Phan Trung Hiếu',45),
(1,'10935',N'Lê Thị Tuyết Ngọc',46),
(1,'10131',N'Bùi Đình Thắng',47),
(1,'10944',N'Nguyễn Võ Lam Giang',48),
(1,'20764',N'Mai Vân Phương Vũ',49),
(1,'20609',N'Văn Thế Thành',50),
(1,'10011',N'Cao Minh Thành',51),
(1,'20771',N'Huỳnh Hồ Thị Mộng Trinh',52),
(1,'10125',N'Võ Thành Lâm',53), 
--==SPKHTN
(1,'11139',N'Nguyễn Hữu Duy Khang',54),
(1,'11050',N'Nguyễn Văn Tú',56),
(1,'10161',N'Vũ Hoài Nam',57),
(1,'10595',N'Lê Minh Đức',58),
(1,'11222',N'Lê Thị Minh Phương',59),
(1,'10095',N'Mai Ngọc Dũng',61),
(1,'10147',N'Đặng Thị Ngọc Thanh',62),
(1,'11540',N'Đỗ Quang Bình',63),
(1,'11157',N'Nguyễn Thị Lan Hương',64),
(1,'11153',N'Phạm Thị Thủy',67),
(1,'11375',N'Lương Văn Tùng',68),
(1,'10138',N'Bùi Thị Cẩm Huệ',69),
(1,'10156',N'Lê Minh Thanh Châu',70),
(1,'10092',N'Dương Trí Trung',71),
(1,'10133',N'Phạm Thị Giang Anh',72),
(1,'11607',N'Lê Thị Thanh Thúy',73),
(1,'11158',N'Nguyễn Hữu Thọ',74),
(1,'11333',N'Quách Nguyễn Khánh Nguyên',75),
(1,'11300',N'Nguyễn Thị Phượng Liên',76),
(1,'10150',N'Ngô Huyền Trân',77),
(1,'10916',N'Đặng Xuân Dự',78),
(1,'11325',N'Bùi Xuân Vương',79),
(1,'11260',N'Nguyễn Thanh Tuấn',80),
(1,'10139',N'Nguyễn Đức Hưng',81),
(1,'10141',N'Dư Lý Thùy Hương',83),
(1,'11105',N'Nguyễn Văn Thắng',84),
(1,'11075',N'Phạm Thị Thanh Hiền',85),

(1,'11206',N'Nguyễn Thị Hương Giang',18),
(1,'11232',N'Nguyễn Thị Lệ Giang',19),

(1,'10761',N'Trần Thế Phi',20),
(1,'11076',N'Nguyễn Quang Minh Triết',21),
(1,'11318',N'Hà Nguyễn Tuyết Minh',22),
(1,'11304',N'Bùi Nguyễn Nguyệt Minh',23),
(1,'11548',N'Nguyễn Lê Thanh GIang',24),
(1,'11282',N'Lê Hà Tố Quyên',25),
(1,'11476',N'Đỗ Tiến Lộc',26)

					-----======================		Học Phần	 ======================

Insert into HOCPHAN values
('861301',N'Triết học Mác-Lênin',3,0,'40%','GDCT',null),
('861302',N'Kinh Tế Chính Trị Mác-Lênin',2,0,'40%','GDCT',null),
('861303',N'Chủ Nghĩa Xã Hội Khoa Học',2,0,'40%','GDCT',null),
('861304',N'Tư Tưởng Hồ Chí Minh',2,0,'40%','GDCT',null),
('861305',N'Lịch Sử Đảng Cộng Sản Việt Nam',2,0,'40%','GDCT',null),
('866101',N'Tiếng Anh I',2,0,'40%','NN',null),
('866102',N'Tiếng Anh II',2,0,'40%','NN',null),
('866103',N'Tiếng Anh III',3,0,'40%','NN',null),
('865006',N'Pháp Luật Đại Cương',2,0,'40%','GDCT',null),
('862101',N'Giáo Dục Thể Chất(I)',1,0,'40%','GDCT',null),
('862406',N'Giáo Dục Quốc Phòng An Ninh I',3,0,'40%','QPAN&GDTC',null),
('862407',N'Giáo Dục Quốc Phòng An Ninh II',2,0,'40%','QPAN&GDTC',null),
('862408',N'Giáo Dục Quốc Phòng An Ninh III',2,0,'40%','QPAN&GDTC',null),
('862409',N'Giáo Dục Quốc Phòng An Ninh IV',4,0,'40%','QPAN&GDTC',null),

('841405',N'Xác Xuât Thống Kê',3,1,'40%','CNTT',null),
('841401',N'Giải Tích 1',3,1,'40%','CNTT',null),
('841406',N'Giải Tích 2',3,1,'40%','CNTT',null),
('841402',N'Đại Số Tuyến Tính',3,1,'40%','CNTT',null),
('841020',N'Cơ Sở Lập Trình',3,1,'50%','CNTT',null),
('841303',N'Kỹ Thuật Lập Trình',4,1,'50%','CNTT',null),
('841021',N'Kiến Trúc Máy Tính',3,1,'50%','CNTT',null),
('841022',N'Hệ Điều Hành',3,1,'50%','CNTT',null),
('841403',N'Cấu Trúc Rời Rạc',4,1,'40%','CNTT',null),
('841108',N'Cấu Trúc Dữ Liệu và Giải Thuật',4,1,'50%','CNTT',null),
('841404',N'Mạng Máy Tính',3,1,'50%','CNTT',null),
('841044',N'Lập Trình Hướng Đối Tượng',4,1,'50%','CNTT',null),
('841109',N'Cơ Sở Dữ Liệu',4,1,'50%','CNTT',null),
('841100',N'Cơ Sở Trí Tuệ Nhân Tạo',4,1,'50%','CNTT',null),
('841310',N'Lý Thuyết Đồ Thị',3,2,'50%','CNTT','DCT'),
('841414',N'Thiết Kế Phân Tích Giải Thuật',3,2,'50%','CNTT','DCT'),
('841047',N'Công Nghệ Phần Mềm',4,1,'50%','CNTT',null),
('841048',N'Phân Tích Thiết Kế HTTT',4,1,'50%','CNTT',null),
('841058',N'Hệ Điều Hành Mã Nguồn Mở',3,1,'50%','CNTT',null),
('841419',N'Lập Trình Web và Ứng Dụng',4,1,'50%','CNTT',null),
('841420',N'Lập trình trực quan',4,1,'50%','CNTT',null),
('841422',N'Ngôn ngữ lập trình Python',4,1,'50%','CNTT',null),
('841423',N'Ngôn ngữ lập trình C#',4,1,'50%','CNTT',null),
('841107',N'Ngôn ngữ lập trình Java',4,1,'50%','CNTT',null),
('841424',N'Phương pháp mô hình hóa',3,1,'50%','CNTT',null),
('841429',N'Cơ sở dữ liệu nâng cao',4,1,'50%','CNTT','DCT'),
('841407',N'Các hệ quản trị cơ sở dữ liệu',4,1,'50%','CNTT',null),
('841418',N'Mô Hình Tài Chính',3,2,'50%','CNTT','DCT'),
('841426',N'Quản Lý và Bảo Mật Dữ Liệu',3,2,'50%','CNTT','DCT'),
('841413',N'Cơ Sở Dữ Liệu Phân Tán',4,2,'50%','CNTT','DCT'),
('841111',N'Phân Tích Thiết Kế Hướng Đối Tượng',4,1,'50%','CNTT',null),
('841120',N'An Toàn và Bảo Mật Dữ Liệu Trong HTTT',3,1,'50%','CNTT',null),
('841068',N'HTTT Doanh Nghiệp',3,1,'50%','CNTT',null),
('841412',N'Nguyên Lý và Phương Pháp Lập Trình',4,1,'50%','CNTT',null),
('841432',N'Phân Tích Dữ Liệu',4,2,'50%','CNTT','DCT'),
('841433',N'Các Hệ Thống Cơ Sở Dữ Liệu',4,1,'50%','CNTT',null),
('841434',N'Thương Mại Điện Tử và Ứng Dụng',4,1,'50%','CNTT',null),
('841435',N'Hệ Hỗ Trợ Quyết Đinh',4,2,'50%','CNTT','DCT'),
('841409',N'Mạng Máy Tính Nâng Cao',4,2,'50%','CNTT','DCT'),
('841438',N'Lập Trình Ứng Dụng Mạng',4,2,'50%','CNTT','DCT'),
('841411',N'Quản Trị Mạng',4,1,'50%','CNTT',null),
('841410',N'An Ninh Mạng Máy Tính',4,1,'50%','CNTT',null),
('841439',N'Mạng Không Dây',4,2,'50%','CNTT','DCT'),
('841440',N'Phân Tích và Thiết Kế Mạng Máy Tính',4,2,'50%','CNTT','DCT'),
('841437',N'Các Giải Thuật Phân Tán',4,2,'50%','CNTT','DCT'),
('841441',N'Đánh Giá Hiệu Năng Mạng',3,2,'50%','CNTT','DCT'),
('841442',N'Mạng Đa Phương Tiện và Di Động',3,1,'50%','CNTT',null),
('841443',N'Phân TÍch Mạng Truyền Thông Xã Hội',3,2,'50%','CNTT','DCT'),
('841319',N'An Toàn Mạng Không Dây và Di Động',3,2,'50%','CNTT','DCT'),
('841444',N'Quản Trị và Bảo Trì Hệ Thống',3,2,'50%','CNTT','DCT'),
('841445',N'Hệ Thống Ảo và Khả Năng Mở Rộng Dữ Liệu',3,2,'50%','CNTT','DCT'),
('841446',N'Phân Tích và Xử Lý Ảnh',4,2,'50%','CNTT','DCT'),
('841447',N'Khai Thác Dữ Liệu và Ứng Dụng',4,2,'50%','CNTT','DCT'),
('841448',N'Xử Lý Ngôn Ngữ Tư Nhiên',4,2,'50%','CNTT','DCT'),
('841449',N'Nhập Môn Máy Học',4,2,'50%','CNTT','DCT'),
('841450',N'Nhập Môn Dữ Liệu Lớn',4,2,'50%','CNTT','DCT'),
('841451',N'Tính toán song song',3,2,'50%','CNTT','DCT'),
('841452',N'Tính Toán Thông Minh',3,2,'50%','CNTT','DCT'),
('841116',N'Đồ Họa Máy Tính',3,2,'50%','CNTT','DCT'),
('841453',N'Phân Tích và Nhận Dạng Mẫu',3,2,'50%','CNTT','DCT'),
('841454',N'Xử Lý Ảnh Nâng Cao',4,2,'50%','CNTT','DCT'),
('841455',N'Ngôn Ngữ Học Máy Tính',3,2,'50%','CNTT','DCT'),
('841456',N'Công Nghệ Tri Thức',4,2,'50%','CNTT','DCT'),
('841457',N'Học Sâu',4,2,'50%','CNTT','DCT'),
('841458',N'Trí Tuệ Nhân Tạo Nâng Cao',4,2,'50%','CNTT','DCT'),
('841052',N'Xây Dựng Phần Mềm Theo Mô Hình Phần Lớp',4,1,'50%','CNTT',null),
('841408',N'Kiểm Thử Phần Mềm',4,1,'50%','CNTT',null),
('841481',N'Thiết Kế Giao Diện',4,1,'50%','CNTT',null),
('841461',N'Nhập Môn Phát Triển Ứng Dụng Trên Thiết Bị Di Động',4,2,'50%','CNTT','DCT'),
('841464',N'Lập Trình Web và Ứng Dụng Nâng Cao',4,1,'50%','CNTT',null),
('841113',N'Phát Triển Phần Mềm Mã Nguồn Mở',3,1,'50%','CNTT',null),
('841320',N'Công Nghệ Internet of Things',3,1,'50%','CNTT',null),
('841323',N'Điện Toán Đám Mây',3,1,'50%','CNTT',null),
('841431',N'Quản Lý Dự Án Phần Mềm',4,1,'50%','CNTT',null),
('841467',N'Công Nghệ .NET',4,1,'50%','CNTT',null),
('841468',N'Công Nghệ J2EE',4,1,'50%','CNTT',null),
('841470',N'Tương Tác Người Máy',4,1,'50%','CNTT',null),
('841463',N'Phát Triển Ứng Dụng Trên Thiết Bị Di Động Nâng Cao',4,1,'50%','CNTT',null),
('841428',N'Nhập Môn An Toàn Thông Tin ',3,2,'50%','CNTT','DKP'),
('841462',N'Phát Triển Ứng Dụng Trên Thiết Bị Di Động',4,2,'50%','CNTT','DKP'),
('841477',N'Lập Trình Game',4,2,'50%','CNTT','DKP'),

---Khoa Sư Phạm Khoa Học Tự Nhiên-------------
('863001',N'Tâm Lý Học Đại Cương',2,1,'50%','SPKHTN',null),
('863005',N'Giáo Dục Học Đại Cương',2,1,'50%','SPKHTN',null),
('863404',N'TLH Lứa Tuổi Trung Học và TLH Sư Phạm',2,1,'50%','SPKHTN',null),
('863408',N'Tổ Chức HĐ Dạy Học và GD ở Trường Trung Học',2,1,'50%','SPKHTN',null),
('863412',N'Quản Lý HCNN và Quản Lý Ngành GDDT (Trường TH)',2,1,'50%','SPKHTN',null),
-----Sư Phạm Khoa Học Tự Nhiên-----------
('821402',N'Toán Cho SPKHTN 1',3,2,'50%','SPKHTN','DKH'),
('821403',N'Toán Cho SPKHTN 2',2,2,'50%','SPKHTN','DKH'),
('821401',N'Sinh Học Phân Tử và Tế Bào',3,2,'50%','SPKHTN','DKH'),
('821407',N'Động Vật Học',4,2,'50%','SPKHTN','DKH'),
('821303',N'Thực Vật Học',3,2,'50%','SPKHTN','DKH'),
('821404',N'Cơ Sở Vật Lý 1',4,2,'50%','SPKHTN','DKH'),
('821405',N'Cơ Sở Vật Lý 2',4,2,'50%','SPKHTN','DKH'),
('821315',N'Dao Động và Sóng',2,2,'50%','SPKHTN','DKH'),
('821408',N'Thí Nghiệm Cơ Sở Vật Lý',2,2,'50%','SPKHTN','DKH'),
('821409',N'Hóa Lý',3,2,'50%','SPKHTN','DKH'),
-----Sư Phạm Vật Lý---------------------
('802301',N'Cơ Học',4,2,'50%','SPKHTN','DLI'),
('802103',N'Nhiệt Học',3,2,'50%','SPKHTN','DLI'),
('802022',N'Điện và Từ',4,2,'50%','SPKHTN','DLI'),
('802024',N'Quang Học',3,2,'50%','SPKHTN','DLI'),
('802302',N'Toán Cho Vật Lý',3,2,'50%','SPKHTN','DLI'),
('802023',N'Dao Động và Sóng',3,2,'50%','SPKHTN','DLI'),
('802401',N'Vật Lý Nguyên Tử và Hạt Nhân',3,2,'50%','SPKHTN','DLI'),
('802402',N'Thí Nghiệm Vật Lý Đại Cương',2,2,'50%','SPKHTN','DLI'),
('802135',N'Thiên Văn Học Đại Cương',3,2,'50%','SPKHTN','DLI'),
('802051',N'Nhiệt Động Lực Học',2,2,'50%','SPKHTN','DLI'),
------Sư Phạm Hóa Học----------------
('803301',N'Toán Cho Hóa',4,2,'50%','SPKHTN','DHO'),
('864003',N'Vật Lý Đại Cương',3,2,'50%','SPKHTN','DHO'),
('803102',N'Hóa Học Đại Cương 1',3,2,'50%','SPKHTN','DHO'),
('803022',N'Hóa Học Đại Cương 2',3,2,'50%','SPKHTN','DHO'),
('803103',N'Thực Hành Hóa Học Đại Cương',1,2,'50%','SPKHTN','DHO'),
('803302',N'Cơ Sở Hóa Lượng Tử',3,2,'50%','SPKHTN','DHO'),
('803050',N'Hóa Vô Cơ 1',3,2,'50%','SPKHTN','DHO'),
('803105',N'Hóa Vô Cơ 2',3,2,'50%','SPKHTN','DHO'),
('803052',N'Thực Hành Hóa Vô Cơ',2,2,'50%','SPKHTN','DHO'),
('803303',N'Hóa Hữu Cơ 1',4,2,'50%','SPKHTN','DHO'),
-------Sư Phạm Sinh Học-------------------
('864004',N'Hóa Học Đại Cương',3,2,'50%','SPKHTN','DSI'),
('806402',N'Thống Kê Sinh Học',3,2,'50%','SPKHTN','DSI'),
('806302',N'Sinh Học Tế Bào',3,2,'50%','SPKHTN','DSI'),
('806401',N'Sinh Hóa Học',3,2,'50%','SPKHTN','DSI'),
('806050',N'Động Vật Học 1',3,2,'50%','SPKHTN','DSI'),
('806051',N'Động Vật Học 2',3,2,'50%','SPKHTN','DSI'),
('806052',N'Thực Vật Học 1',3,2,'50%','SPKHTN','DSI'),
('806053',N'Thực Vật Học 2',3,2,'50%','SPKHTN','DSI'),
('806060',N'Vi Sinh Vật Học',3,2,'50%','SPKHTN','DSI'),
('806403',N'Di Truyền Học',4,2,'50%','SPKHTN','DSI')

					-----======================		Điều Kiện	 ======================
insert into DIEUKIEN values
--====== Môn chung các Khoa
('861302','861301'),
('861303','861302'),
('861304','861303'),
('861305','861303'),
('866102','866101'),
('862407','862406'),
('862408','862407'),
('862409','862408'),

--====== Khoa SPKHTN
('863404','863001'),
('863408','863005'),
('863412','863408'),
('821407','821401'),
('821303','821401'),
('821405','821404'),
('821315','821405'),
('802023','802301'),
('802402','802301'),
('802051','802103'),
('803103','803102'),
('803302','803301'),
('803050','803102'),
('803105','803050'),
('806051','806050'),
('806053','806052'),

--====== Khoa CNTT
('841406','841401'),
('841303','841020'),
('841022','841021'),
('841310','841108'),
('841048','841109'),
('841419','841020'),
('841429','841109'),
('841407','841109'),
('841413','841109'),
('841111','841044'),
('841412','841044'),
('841068','841048'),
('841433','841109'),
('841434','841109'),
('841435','841108'),
('841464','841419')

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

