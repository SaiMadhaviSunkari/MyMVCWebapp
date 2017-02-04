<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Comic World</title>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
        
        
<link rel="stylesheet" href="resources/css/Home.css">
       
    </head>
    <body data-spy="scroll" data-target=".navbar" data-offset="50">

        <div class="container-fluid"
		style="background-color: activecaption; color: crimson; height: 200px;">
		<div style="align_content: center">
			<h1 style="font-family: cursive;" class="text-center">Welcome to
				world of Cartoons</h1>
		</div>
		<div class="container">
			<img src="resources/images/garfild.gif" alt="Author"
				style="float: center; width: 120px; height: 150px; font_family: cursive;"
				data-toggle="popover" title="Garifield:"
				data-content="How are you doing today?">


		</div>

	</div>
        
        <nav class="navbar navbar-inverse" data-spy="affix" data-offset-top="197">
            <div class="container-fluid">
                <div class="navbar-header">
                    <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>
                        <span class="icon-bar"></span>                        
                    </button>
                    <a class="navbar-brand" href="#">Cartoon Lovers</a>
                </div>
                <div>
                    <div class="collapse navbar-collapse" id="myNavbar">
                        <ul class="nav navbar-nav">
                            <li><a href="#About">Who are WE?</a></li>
                            <li class="dropdown"><a class="dropdown-toggle" data-toggle="dropdown" href="#">Link with COMIC FAMILY<span class="caret"></span></a>
                                <ul class="dropdown-menu">
                                    <li><a href="#Register">NEW?</a></li>
                                    <li><a href="#Login">ReUnite</a></li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
        </nav>    

        <div id="About" class="container-fluid">
            <header>
                <h1> How it all started?</h1>
            </header>
            <article>
                <h1> About Author:</h1>
                <div>
                    <img src="resources/images/MyPicture.jpg" alt="Author" style="float:right;width:120px;height:150px;" >
                <div style="max-height:250px;overflow-y:scroll">
                <p>Olenka, the daughter of the retired collegiate assessor, Plemyanniakov, was sitting in her back porch, lost in thought. It was hot, the flies were persistent and teasing, and it was pleasant to reflect that it would soon be evening. Dark rainclouds were gathering from the east, and bringing from time to time a breath of moisture in the air.
                    Kukin, who was the manager of an open-air theatre called the Tivoli, and who lived in the lodge, was standing in the middle of the garden looking at the sky.
                    "Again!" he observed despairingly. </p><p>"It's going to rain again! Rain every day, as though to spite me. I might as well hang myself! It's ruin! Fearful losses every day."
                    He flung up his hands, and went on, addressing Olenka:
                    "There! that's the life we lead, Olga Semyonovna. It's enough to make one cry. One works and does one's utmost, one wears oneself out, getting no sleep at night, and racks one's brain what to do for the best. And then what happens? To begin with, one's public is ignorant, boorish. I give them the very best operetta, a dainty masque, first rate music-hall artists. But do you suppose that's what they want! They don't understand anything of that sort. They want a clown; what they ask for is vulgarity. And then look at the weather! Almost every evening it rains. It started on the tenth of May, and it's kept it up all May and June. It's simply awful! The public doesn't come, but I've to pay the rent just the same, and pay the artists."
                </p><p>"It's going to rain again! Rain every day, as though to spite me. I might as well hang myself! It's ruin! Fearful losses every day."
                    He flung up his hands, and went on, addressing Olenka:
                    "There! that's the life we lead, Olga Semyonovna. It's enough to make one cry. One works and does one's utmost, one wears oneself out, getting no sleep at night, and racks one's brain what to do for the best. And then what happens? To begin with, one's public is ignorant, boorish. I give them the very best operetta, a dainty masque, first rate music-hall artists. But do you suppose that's what they want! They don't understand anything of that sort. They want a clown; what they ask for is vulgarity. And then look at the weather! Almost every evening it rains. It started on the tenth of May, and it's kept it up all May and June. It's simply awful! The public doesn't come, but I've to pay the rent just the same, and pay the artists."
                </p><p>"It's going to rain again! Rain every day, as though to spite me. I might as well hang myself! It's ruin! Fearful losses every day."
                    He flung up his hands, and went on, addressing Olenka:
                    "There! that's the life we lead, Olga Semyonovna. It's enough to make one cry. One works and does one's utmost, one wears oneself out, getting no sleep at night, and racks one's brain what to do for the best. And then what happens? To begin with, one's public is ignorant, boorish. I give them the very best operetta, a dainty masque, first rate music-hall artists. But do you suppose that's what they want! They don't understand anything of that sort. They want a clown; what they ask for is vulgarity. And then look at the weather! Almost every evening it rains. It started on the tenth of May, and it's kept it up all May and June. It's simply awful! The public doesn't come, but I've to pay the rent just the same, and pay the artists."
                </p>

                </div>
                </div>
            </article>

        </div>
        <div id="Register" class="container-fluid">
            <div class="jumbotron1" style="margin-left:-15px;margin-right:-15px;">
                <h1 style="color:white;font-family: cursive;">Join Us- the world's favorite network of cartoon lovers 
                    <img src="resources/images/Gari1.gif" alt="cartoon" style="float:right;width:120px;height:150px; margin:-20px">
                </h1>
                
            </div>
           <h1> <a href="Register" target="_self">Steps away from being a part of Cartoon Lovers</a></h1>
           
        </div>
        <div id="Login" class="container-fluid">
            <div class="jumbotron" style="margin-left:-15px;margin-right:-15px;">
                <h1 style="color:white;">ReUnite with family
                    <img src="resources/images/Gari1.gif" alt="cartoon" style="float:right;width:120px;height:150px; margin:-20px">
                    
                </h1>
                
            </div>
            <h1><a href="Login" target="_self">Cartoon Lovers login </a></h1>
        </div>
        <script>
            $(document).ready(function () {
                $('[data-toggle="popover"]').popover();
            });
        </script>
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.1.1/jquery.min.js"></script>
        <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

    </body>
</html>


