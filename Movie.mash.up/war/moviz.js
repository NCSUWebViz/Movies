                var canvas, graphics;
				function draw_init() {
					canvas = document.getElementById('demoCanvas');
					if (canvas.getContext){
						graphics = canvas.getContext('2d');
					}
					draw();
				}
				function draw() {
					var theme = ["#758B43","#95AB63","#BDD684","#E2F0D6","#F6FFE0"];
					var x = Math.random() * 300;
					var y = Math.random() * 150;
					var size = (Math.random() * 100) + 20;
					var num_circles = (Math.random() * 10) + 2;
					for (var i = size; i > 0; i-= (size/num_circles))
					{
						graphics.fillStyle = theme[ (Math.random() * 5 >> 0)];
						graphics.beginPath();
						graphics.arc(x, y, i * .5, 0, Math.PI*2, true); 
						graphics.closePath();
						graphics.fill();
					}
					t = setTimeout('draw()',1000);
				}
				draw_init();
