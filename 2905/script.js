document.addEventListener("DOMContentLoaded", loaded);

function loaded() {
    document.getElementById("btn1").addEventListener("click", btn_clickJSON);
    document.getElementById("btn2").addEventListener("click", btn_clickJSON);
}

function btn_click(event) {
    var req = new XMLHttpRequest();
    if (event.target.id == "btn1") {
        req.open("GET", "table1.html");
    } else {
        req.open("GET", "table2.html");
    }
    req.onreadystatechange = function recieve() {
        if (req.readyState == req.DONE) {
            document.getElementById("table-body").innerHTML = req.responseText;
        }
    }
    req.send();
}

function btn_clickJSON(event) {
    var req = new XMLHttpRequest();
    if (event.target.id == "btn1") {
        req.open("GET", "table1.json");
    } else {
        req.open("GET", "table2.json");
    }
    req.onreadystatechange = function recieve() {
        if (req.readyState == req.DONE) {
            var parsed = JSON.parse(req.responseText);
            var body = document.createElement("tbody");
            body.id = "table-body";
            for (var row of parsed.rows) {
                var trow = document.createElement("tr");
                for (var elem of row) {
                    var tdata = document.createElement("td");
                    tdata.innerText = elem;
                    trow.appendChild(tdata);
                }
                body.appendChild(trow);
            }

            document.getElementById("table-body").replaceWith(body);
        }
    }
    req.send();
}