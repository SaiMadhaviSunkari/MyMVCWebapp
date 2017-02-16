/**
 * 
 */
function ValidateForm() {//ValidateForm()
	var uname = document.getElementById('userName').value;
	var pwd = document.getElementById('password').value;
	var name = document.getElementById('name').value;
	var email = document.getElementById('email').value;
	var confirm = document.getElementById('confirm').value;
	document.getElementById('userName').innerHTML = '';
	document.getElementById('name').innerHTML = '';
	document.getElementById('email').innerHTML = '';
	document.getElementById('password').innerHTML = '';
	document.getElementById('confirm').innerHTML = '';
	if ((name.length==0) || (uname.length==0) || (email.length==0) || (pwd.length==0)
			|| (confirm.length==0)) {
		alert('Empty Field(s)');
		return false;
	} else if (pwd.length < 8) {
		$('.pwd').html("password too short");
		$('.pwd').show();
		return false;
	} else if (pwd!= confirm) {
		$('.cpwd').html("password doesnt match");
		$('.cpwd').show();
		return false;
	} else {
		return true;
	}
}
/*
 * function btnClickedFunction() { var
 * pwd=document.getElementById('password').value; //var
 * name=document.getElementById('name').value; //var
 * email=document.getElementById('email').value; var
 * confirm=document.getElementById('confirm').value;
 * //document.getElementById('pwderror').innerHTML = '';
 * //document.getElementById('conerror').innerHTML = ''; if (pwd.length < 8) {
 * alert('Password Too short'); return false; } else if
 * (!pwd.compareTo(confirm)){ alert('NO MATCH'); return false; } else { return
 * true; }
 *  }
 */