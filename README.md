<h3>Rest API WITH JAVA SPRING BOOT</h3>

#About Project
Project ini adalah project pembuatan rest api dengan menggunakan famework java spring boot. Proses pengelolahan data pada project ini menggunakan MySQL. Project ini menggunakan beberapa dependensi dari java spring boot diantaranya.

- Spring Web
- JPA Data Spring
- MySQL Driver

## Cara Penggunaan
Anda bisa clone atau download aplikasi ini lalu buka dengan menggunakan spring tools suit atau bisa juga menggunakan text editor yang sudah terinstall extension java spring. buat database baru dengan mengunakan application local server dengan nama database "restapispringboot".

- Menjalankan Applikasi dengan Windows
<pre>
    <code>mvnw spring-boot:run</code>
</pre>
- Menjalankan Applikasi dengan MacOS/Linux
<pre>
    <code>./mvnw spring-boot:run</code>
</pre>

## RestAPI
Project ini berjalan dengan menggunakan port:8181 anda dapat mengaksesnya dengan localhost:8181. jika ingin merubah port anda dapat merubahnya pada application.properties dalam project ini. Gunakan aplikasi postman untuk mengakses penggunakan RestAPI pada project ini.
- Menampilkan seluruh data
<pre>
    Use with GET Data
    <code>
        localhost:8181/user
    </code>
</pre>
- Menambahkan data baru
<pre>
    Use With POST Data
    <code>
        localhost:8181/user/insert
    </code>
</pre>
- Merubah data berdasarkan id
<pre>
    Use With PUT Data
    <code>
        localhost:8181/user/edit/{id}
    </code>
</pre>
- Menghapus data
<pre>
    Use With DELETE Data
    <code>
        localhost:8181/user/delete/{id}
    </code>
</pre>

