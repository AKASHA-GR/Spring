function confirmDelete(id) {
    if (confirm("Are you sure you want to delete this record?")) {
        window.location.href = "/opener/vodka/vodkaDelete?id=" + id;
    }
}
