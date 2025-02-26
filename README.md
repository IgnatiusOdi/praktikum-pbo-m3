# praktikum-pbo-m3

## Praktikum PBO M3

### Materi

Buatlah program StackOverflow sederhana. Berikut tampilan menu utamanya.

```
''' Welcome to StuckOverflow! '''
1. Register
2. Login
3. Exit
>>> 1
== Register ==
Full name : David Cahyadi
username  : david
password  : inipassword
Account created!
Welcome to StackOverflow!
1. Register
2. Login
3. Exit
```

Pada program ini, user dapat memilih untuk login, register, atau exit. Bila memilih register, mintalah inputan nama, username, dan password. Pastikan username tidak boleh sama dengan user yang sudah ada sebelumnya. Berikan pesan bahwa register gagal bila menggunakan username yang sudah digunakan. Bila memilih login, mintalah username dan password. Berikan pesan bila username tidak terdaftar atau password salah.

```
Welcome back, David Cahyadi!
1. Create a post
2. See all post
3. Logout
>>> 1
Title  : How to use ArrayList in java?
Detail : I need to use ArrayList for my project, but I don't know how to use it. Any solution?
!! Posted Successfully! !!
Welcome back, David Cahyadi!
1. Create a post
2. See all post
3. Logout
>>>
```

Setelah login, tiap user dapat logout, membuat post ataupun melihat semua post. Bila memilih logout, kembalikan ke menu utama. Bila memlih create a post, mintalah judul dan deskripsi dari post yang akan dibuat.

```
--- All Posts ---
1. How to use ArrayList in java? | by David Cahyadi(david)
2. How to remove object from ArrayList ? | by Chen(dragonslz)
0.
>>> 2
-------------
How to remove object from ArrayList ?
-I need to remove an object from ArrayList in java. How to do it?
Replies:
1. Use .remove(i) where i is the index of the object in the list. (3 votes)
2. You can use .remove(o) where o is the object you want to remove from the ist. (2 votes)
-------------
1. Add reply
2. Add vote
0. Back
>>>
```

Bila memilih see all posts, tampilkan semua post yang dimiliki oleh semua user yang terdaftar (termasuk diri sendiri) dengan format <Judul> | by <nama>(<username>). Dalam menu all posts, user dapat memilih salah satu post. Setelah memilih satu post, tampilkan judul beserta deskripsi post yang dipilih beserta replies nya. Tampilkan pula jumlah vote pada tiap reply di post tersebut. Pastikan semua replies diurutkan berdasarkan votes terbanyak. Pada post tersebut, user dapat menambahkan reply ataupun memberikan vote pada reply yang sudah ada.

Berikut tampilan untuk add reply.

```
All Posts --=
1. How to use ArrayList in java? | by David Cahyadi(david)
0. Back
>>> 1
-------------
How to use ArrayList in java? | by David Cahyadi(david)
-I need to use ArrayList for my project, but I don't know how to use it. Any solution?
Replies:
No reply.
-------------
1. Add reply
2. Add vote
0. Back
>>> 1
Reply : The format is ArrayList<T> varName = new ArrayList<T>();, where T is the data type.
Replied successfully!
-------------
How to use ArrayList in java? | by David Cahyadi(david)
-I need to use ArrayList for my project, but I don't know how to use it. Any solution?
Replies:
1. The format is ArrayList<T> varName = new ArrayList<T>();, where T is the data type. (0 votes)
-------------
1. Add reply
2. Add vote
0. Back
>>>
```

Dan berikut adalah tampilan untuk add vote. Pastikan bahwa user tidak dapat vote 2 kali pada reply yang sama.

```
--- All Posts ---
1. How to use ArrayList in java? | by David Cahyadi(david)
2. How to remove object from ArrayList ? | by Chen(dragonslz)
>>> 2
-------------
How to remove object from ArrayList ?
-I need to remove an object from ArrayList in java. How to do it?
Replies:
1. Use .remove(i) where i is the index of the object in the list. (3 votes)
2. You can use .remove(o) where o is the object you want to remove from the list. (1 votes)
-------------
1. Add reply
2. Add vote
0. Back
>>> 2
Replies:
1. Use .remove(i) where i is the index of the object in the list. (3 votes)
2. You can use .remove(o) where o is the object you want to remove from the list. (1 votes)
0. Back
>>> 1
Vote failed! You already voted that reply!
Replies:
1. Use .remove(i) where i is the index of the object in the list. (3 votes)
2. You can use .remove(o) where o is the object you want to remove from the list. (1 votes)
0. Back
>>> 2
Voted!
Replies:
1. Use .remove(i) where i is the index of the object in the list. (3 votes)
2. You can use .remove(o) where o is the object you want to remove from the list. (2 votes)
0. Back
>>> 0
-------------
```

### Tugas

Buatlah program Instagram sederhana 😉

Pada awal program mintalah user untuk memilih login atau register Instogram terlebih dahulu. Tampilan awal program adalah sebagai berikut

```
-------Instogram-------
1. Login
2. Register
3. Exit
```

Register\
Pada menu register user dapat mendaftarkan dirinya dengan cara menginputkan data-data yang diperlukan terlebih dahulu. Tampilkan menu register seperti dibawah ini.

```
-------Instogram-------
Name:Christian Chen
Username:chen
Password:bruh
Confirm Password:bruh
User berhasil didaftarkan!
```

Pastikan username tiap user itu unique, jika user memasukan username yang sudah terpakai maka berilah pesan error “Username is already used!”. Jika password dan confirm password tidak sesuai maka berilah pesan error juga. Berilah pesan berhasil apabila user berhasil didaftarkan. Setelah user berhasil didaftarkan maka kembalikan user ke menu utama.

Login\
Pada menu Login, user akan menginputkan username dan password. Jika username tidak terdaftar berilah pesan error “User tidak terdaftar”. Berilah pesan “Password Salah” apabila username terdaftar tetapi password yang di masukkan salah. Jika username dan password sesuai maka berilah pesan “User berhasil login!” dan munculkan tampilan menu awal user.

Tampilan Login

```
-------Instogram-------
Username:chen
Password:bruh
User berhasil login!
```

Tampilan menu Awal

```
-------Instogram Menu-------
Hi! Christian Chen
/--------------------\
|                    |
|                    |
|                    |
|   Welcome to       |
|      Instogram     |
|                    |
|    Powered by      |
|      ISTTS         |
|____________________|
\__________O_________/

1. Create a Post
2. Search User
3. Send a Message
4. Follower List
5. Following List
6. List all Post
7. List all User
8. Notification (2)
9. Logout
```

Create a Post\
Pada menu ini, user diminta inputan untuk membuat suatu post. User akan diminta untuk input title dan input caption. Kemudian setelah user berhasil menambahkan post kembalikan user ke main menu.

```
-------Instogram Post-------
Input Title: Tugas PBO
Input Caption: Selamat Mengerjakan
Post has been added!
```

Search User\
Pada menu ini, user akan diminta untuk mengisikan username suatu user. Apabila username tidak temukan maka berilah pesan error dan kembalikan user ke menu awal. Apabila username itu ditemukan maka tampilkan profile user yang dicari tadi.

```
-------Instogram Search-------
Input a Username : lawrence
User not found!
Input a Username : jasong
User Found!
-------Instogram Profile-------
Name: Jason Gerald
Username: jasong
Followers: 0 followers
Following: 420 following
-------------------------------
Menu Profile
1. Follow User
2. List Post
3. Like a Post
4. Back to Main Menu
```

Follow User\
Pada menu ini, apabila user belum follow user tersebut maka berilah pesan “User has been followed”. Tambahkan followers pada username “jasong” dan tambahkan 1 following pada “chen”. Untuk username yang di follow, tambahkan pesan ke dalam notifikasi username yang di follow.

List Post\
Tampilkan semua post yang telah dipost oleh username tersebut. Setelah itu kembalikan user ke menu Profile. Tampilan post akan seperti dibawah ini.

```
-------Instogram Post-------
Username: jasong
-----------Posts------------
Title: Halo
Caption: Selamat datang di praktikum PBO
Likes: 0 Likes
----------------------------
Title: Nicko marah part 1
Caption: Nick kok marah?
Likes: 5 Likes
----------------------------
Title: Ini Instogram
Caption: PBO adalah jalan ninjaku
Likes: 2 Likes (Liked)
----------------------------
```

Apabila ada suatu post yang sudah dilike oleh user, maka berilah keterangan “Liked” seperti diatas.

Like a Post\
Pada menu ini, tampilkan list semua post yang di buat oleh user tersebut. Kemudian mintalah user suatu inputan angka untuk memilih post mana yang di like/unlike post. Setelah post tersebut dipilih mintalah lagi suatu inputan (y/n) untuk yes dan no.\
Apabila user memilih post yang belum pernah di like maka tambahkan 1 like kepada post tersebut dan juga sebaliknya. Kemudian user yang memiliki post akan mendapatkan notifikasi apabila post miliknya di like saja.

```
-------Instogram Post-------
Username: jasong
-----------Posts------------
Title: Halo
Caption: Selamat datang di praktikum PBO
Likes: 0 Likes
----------------------------
Title: Nicko marah part 1
Caption: Nick kok marah?
Likes: 5 Likes
----------------------------
Title: Ini Instogram
Caption: PBO adalah jalan ninjaku
Likes: 2 Likes (Liked)
----------------------------
1. Halo
2. Nicko marah part 1
3. Ini Instogram
4. Back to Main Menu
>> 2
Are you sure you want to like “Nicko marah part 1” (y/n)?
>> y
“Nicko marah part 1” has been liked
```

Back to Main Menu\
Pada menu ini kembalikan user ke main menu.

Send a Message\
Pada menu ini, user akan diminta untuk menginputkan suatu username. Berikan pengecekan apabila username yang di cari itu terdaftar atau tidak. Apabila username tidak ditemukan maka berilah pesan error.

```
-------Instogram Message-------
Input a Username : lawrence
User not found!
Input a Username : jasong
User Found!
Message: Valo Kuy?
Send Message(y/n)
>> y
Message sent!
```

Setelah user berhasil mengirim message maka message yang di kirimkan akan masuk ke dalam notifikasi sang user penerima.

Follower List\
Pada menu ini, tampilkan semua follower yang dimiliki oleh user. Format yang ditampilkan adalah Nama - Username

```
-------Instogram Follower-------
1. Jason Gerald - jasong
2. Bryan Christohpher - tofutofu
3. Nickolas Hartono - nickolashartono
0. Exit
>>
```

Following List\
Pada menu ini, tampilkan semua following yang dimiliki oleh user. Format yang ditampilkan adalah Nama - Username

```
-------Instogram Following-------
1. Jason Gerald - jasong
2. Bryan Christohpher - tofutofu
3. Nickolas Hartono - nickolashartono
0. Exit
>>
```

List all Post\
Pada menu ini, tampilkan semua post yang sudah di post di instogram.

```
-------Instogram Posts-------
Title: Halo
Caption: Selamat datang di praktikum PBO
Likes: 0 Likes
Posted by: jasong
-----------------------------
Title: Tugas PBO
Caption: Selamat Mengerjakan
Likes: 0 Likes
Posted by: chen
-----------------------------
Title: Guitar Hero to Zero
Caption: Tutorial Sederhana
Likes: 9 Likes
Posted by: tofutofu
-----------------------------
Title: Valorant Pagi-Pagi
Caption: Ayo sini saya carry
Likes: 2 Likes (Liked)
Posted by: nickolashartono
-----------------------------
Title: Nicko marah part 1
Caption: Nick kok marah?
Likes: 5 Likes
Posted by: jasong
-----------------------------
Title: Ini Instogram
Caption: PBO adalah jalan ninjaku
Likes: 2 Likes (Liked)
Posted by: jasong
-----------------------------
```

List all User\
Pada menu ini tampilkan semua user yang terdaftar di instogram, kemudian cetaklah user yang login paling pertama dan berilah keterangan “You”. Tampilan List all user akan sebagai berikut.

```
-------Instogram Users-------
Name: Christian Chen (You)
Username: chen
Followers: 123 followers
Following: 1 following
-----------------------------
Name: Jason Gerald
Username: jasong
Followers: 0 followers
Following: 420 following
-----------------------------
Name: Nickolas Hartono
Username: nickolashartono
Followers: 111 followers
Following: 6 following
-----------------------------
Name: Bryan Christopher
Username: tofutofu
Followers: 101 followers
Following: 9 following
-----------------------------
```

Notification\
Pada menu ini, tampilkan semua notifikasi dari followed by user, message, dan like post. Apabila notifikasi yang masuk adalah hasil dari followed by user maka formatnya adalah Nama user (username user) has followed you. Apabila notifikasi yang masuk adalah message maka formatnya adalah Nama user (username user) just sent you a message “Message”. Apabila notifikasi yang masuk adalah hasil like a post maka formatnya adalah Nama user (username user) has liked your post “Title Post”.

```
-------Instogram Notification-------
1.
```

Logout\
Apabila user memilih ini maka kembalikan ke menu login.

Exit\
Pada menu ini maka exitlah program tersebut.
