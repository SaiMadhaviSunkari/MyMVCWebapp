/**
 * 
 */
function ValidateForm()
{
	//var uname= document.getElementById('username').value;
	var pwd=document.getElementById('password').value;
	//var name=document.getElementById('name').value;
	//var email=document.getElementById('email').value;
	var confirm=document.getElementById('confirm').value;
	//alert(pwd+"-"+confirm);
	document.getElementById('pwderror').innerHTML = '';
	document.getElementById('conerror').innerHTML = '';
	if (pwd.length <8) {
		document.getElementById('pwderror').innerHTML = 'Password Too short';
		//alert("pswd short");
		return false;
	} else if (pwd!=confirm) {
		document.getElementById('conerror').innerHTML = 'NO MATCH';
		//alert("No match");
		return false;
	}
	else {
		return true;
	}
}
function btnClickedFunction() {
	var pwd=document.getElementById('password').value;
	//var name=document.getElementById('name').value;
	//var email=document.getElementById('email').value;
	var confirm=document.getElementById('confirm').value;
	//document.getElementById('pwderror').innerHTML = '';
	//document.getElementById('conerror').innerHTML = '';
	if (pwd.length < 8) {
		alert('Password Too short');
		return false;
	} else if (!pwd.compareTo(confirm)){
		alert('NO MATCH');
		return false;
	}
	else {
		return true;
	}

}