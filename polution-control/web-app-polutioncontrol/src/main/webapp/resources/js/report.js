function searchReport() {
    var startDateTime = document.getElementById("startDateTime").value;
    var endDateTime = document.getElementById("endDateTime").value;

    var url = "/report?startDateTime=" + encodeURIComponent(startDateTime)
            + "&endDateTime=" + encodeURIComponent(endDateTime);
    window.location.href = url;
}


function resetReport() {
    window.location.href = "/report";
}
