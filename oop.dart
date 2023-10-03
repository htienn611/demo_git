class Point{
int _x=0;
int _y=0;
Point(){this._x=0;this._y=0;}
Point.withParas({int x=0,int y=0}){this._x=x;this._y=y;}
show(){
print(this._x.toString() +'-'+ this._y.toString());
}
}
void main(){
Point p=Point();
p.show();
p=Point.withParas(x:9,y:8);
p.show();
p._x = 5;
p._y=8;
p.show();
}