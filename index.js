var express = require('express');
var app = express();
app.set('view engine', 'ejs');
app.use(express.static('public'));
app.get('/', function(req, res) {
    var data=[
        {
            STT:1,
            Id:"0306211267",
            FullName:"Trần Thị Kim Ngân",
            Birthday:"01-09-2003"
        },
        {
            STT:2,
            Id:"0306211421",
            FullName:"Hoàng Anh Thanh Tiến",
            Birthday:"01-07-2003"
        },
        {
            STT:3,
            Id:"0306211240",
            FullName:"Phạm Công Hậu",
            Birthday:"30-08-2003"
        }
    ]
    res.render('pages/home',{data:data});
});
app.get('/about', function(req, res) {
res.render('pages/about');
});
app.get('/contact',function(req,res){
    res.render('pages/contact')
})
app.listen(3000);
console.log('Server is listening on port 3000');