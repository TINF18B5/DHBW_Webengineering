$().ready(loaded);

function loaded() {
    $("form input:text").focus(changed);
    $("#out span").click(spanClicked);
    changed();
}

function changed() {
    var anrede = $("#anrede-input").val();
    var name = $("#name-input").val();
    var vorname = $("#vorname-input").val();
    var straße = $("#straße-input").val();
    var hausnummer = $("#hausnummer-input").val();
    var plz = $("#plz-input").val();
    var ort = $("#ort-input").val();

    $("#anrede").text(anrede + " ");
    $("#vorname").text(vorname + " ");
    $("#name").text(name + " ");
    $("#straße").text(straße + " ");
    $("#hausnummer").text(hausnummer + " ");
    $("#plz").text(plz + " ");
    $("#ort").text(ort + " ");
}

function spanClicked(event) {
    $("#" + event.target.id + "-input").focus();
}