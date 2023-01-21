class Shape {
    
    int getCorner(){
        return 0;
    }

}

class Rectangle extends Shape {

    int getCorner(){
        return 4;
    }

    int getParentCorner(){
        return super.getCorner();
    }
}

// SUPER KEYWORD
// jadi kan kalau method yang ada di parent udah di override di child gak bakalan bisa akses lagi
// kalau mau mengakses method yang terdapat di class parent yang sudah terlanjur di override di kelas child bisa pakai Super Keyword
// Sederhananya, super digunakan untuk mengakses class parent
// tidak hanya method, field milik parent class pun bisa di akses menggunakan kata kunci super