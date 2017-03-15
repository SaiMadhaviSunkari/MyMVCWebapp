/**
 * 
 */

function btnClickedFunction() {
	var pwd=document.getElementById('password').value;
	
	var confirm=document.getElementById('userName').value;
	
	if((userName=='')||(password==''))
		{
		alert('Empty Field(s)');
		return false;
		}else {
		return true;
	}

}