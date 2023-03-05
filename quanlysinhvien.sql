--Tạo cơ sở dữ liệu quản lý sinh viên
drop database quanlysinhvien
Create database quanlysinhvien
Go
use quanlysinhvien
Go
--Tạo bảng Sinh Viên
Create table SINHVIEN(
MaSV char(10) not null primary key,
Cmnd char(12) not null unique,
HoTen nvarchar(50),
NgaySinh date,
GioiTinh nvarchar(3),
DiaChi nvarchar(50),
DanToc nvarchar(10),
TonGiao nvarchar(10) ,
NienKhoa char(10),
MaNganh char(10),
MaTK int
)
Go

-- Tạo bảng Học Phần
Create table HOCPHAN(
MaHP char(10) not null primary key,
TenMon nvarchar(50),
TinChi int ,
ChuyenBiet int,
PhanTramQuaTrinh char(10),
MaKhoa char(10),
MaNganh char(10)
)
Go
-- Tạo bảng điều kiện học phần
Create table DIEUKIEN(
MaHP char(10),
MaHP_Truoc char(10),
primary key(MaHP,MaHP_Truoc)

)
Go
--Taọ bảng Đăn ký môn học
create table NHOM(
MaHP char(10) not null,
SoNhom int not null,
HocKy int not null,
Nam int not null,
MaGV char(10),
Phong char(10),
SoSinhVien int ,
Thu nvarchar(10),
TietBD int,
SoTiet int,
primary key(MaHP,SoNhom,HocKy,Nam)
)
Go
--Tạo bảng Khoa
Create table KHOA(
MaKhoa char(10) not null primary key,
TenKhoa nvarchar(50),
MaTK int 
)
Go
--Tạo bảng Giảng Viên
Create table GIANGVIEN(
MaGV char(10) not null primary key,
TenGV nvarchar(50),
MaTK int
) 
Go
--Tạo bảng Kết Quả
Create table KETQUA(
MaSV char(10) not null,
MaHP char(10) not null,
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
MaNganh char(10) not null primary key,
TenNganh nvarchar(50),
MaKhoa Char(10)
)
Go
--Tạo bảng Tài Khoản
Create table TAIKHOAN(
MaTK int not null IDENTITY(1,1) primary key,
TenTaiKhoan char(10),
MatKhau nvarchar(50),
MaNhomQuyen char(10)
)
Go
--Taọ bảng nhóm quyền 
Create table NHOMQUYEN(
MaNhomQuyen char(10) not null primary key,
TenNhomQuyen nvarchar(50),
)
Go
--Tạo bảng chi tiết quyền
Create table CHITIETQUYEN(
MaQuyen char(10) not null primary key,
TenQuyen nvarchar(50),
MaNhomQuyen char(10)
)
Go
-- Tạo bảng nhóm quyền chi tiết quyền 
Create table NQ_CTQ(
MaNhomQuyen char(10),
MaQuyen char(10),
primary key(MaNhomQuyen,MaQuyen)
)

					-----====================== Thêm dữ liệu cho bảng ----======================
					-----======================		Sinh Vien	 ======================
set dateformat dmy
Insert into SINHVIEN values
('3121410482','082205014391',N'Nguyễn Minh Thuận','04/09/2003','Nam',N'Tiền Giang','Kinh','Không','2021-2026','DCT','10'),
('3121410066','082206014392',N'Bùi Hông Bảo','01/02/2003','Nam',N'Tiền Giang','Kinh','Không','2021-2026','DCT','11'),
('3121410477','082205014393',N'Nguyễn Tiến Phát','03/04/2003','Nam',N'Tiền Giang','Kinh','Không','2021-2026','DCT','12'),
('3121410488','082205014394',N'Phan Huỳnh Minh Tiến','04/05/2003','Nam',N'Tiền Giang','Kinh','Không','2021-2026','DCT','13')

					-----======================		KHOA	 ======================
Insert into KHOA  values
('CNTT','Công Nghệ Thông Tin',1)

					-----======================		Ngành	 ======================
Insert into NGANH values
('DCT',N'Công Nghệ Thông Tin','CNTT'),
('DKP',N'Kĩ Thuật Phần Mềm','CNTT')
					-----======================		Giảng Viên	 ======================
Insert into GIANGVIEN values
('11384',N'Trương Tấn Khoa',5),
('11271',N'Nguyễn Thị Hồng Anh',6),
('10991',N'Nguyễn Thanh Sang',7),
('11364',N'Lương Minh Huấn',8),
('10631',N'Phan Tấn Quốc',9),
('20766',N'Huỳnh Minh Trí',10),
('11453',N'Nguyễn Tuấn Đăng',11),
('11556',N'Huỳnh Nguyễn Khắc Huy',12),
('11206',N'Nguyễn Thị Hương Giang',13),
('11232',N'Nguyễn Thị Lệ Giang',14)
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

