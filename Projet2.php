<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>projet web</title>
    <style>
        table {
            border-collapse: collapse;
            width: 100%;
        }

        table, th, td {
            border: 1px solid black;
        }

        th, td {
            padding: 8px;
            text-align: left;
        }
    </style>
</head>
<body>

<h2>Page web</h2>

<form id="myForm">
    <label for="id">ID:</label>
    <input type="text" id="id" name="id" required>

    <label for="nom">Nom:</label>
    <input type="text" id="nom" name="nom" required>

    <label for="description">Description:</label>
    <input type="text" id="description" name="description" required>

    <label for="dateDebut">Date début:</label>
    <input type="date" id="dateDebut" name="dateDebut" required>

    <label for="dateFin">Date fin:</label>
    <input type="date" id="dateFin" name="dateFin" required>

    <label for="statut">Statut:</label>
    <select id="statut" name="statut" required>
        <option value="En cours">En cours</option>
        <option value="Terminé">Terminé</option>
        <option value="En attente">En attente</option>
    </select>

    <button type="button" onclick="ajouter()">Ajouter</button>
</form>

<table id="dataTable">
    <tr>
        <th>ID</th>
        <th>Nom</th>
        <th>Description</th>
        <th>Date début</th>
        <th>Date fin</th>
        <th>Statut</th>
        <th>Actions</th>
    </tr>
</table>

<script>
    function ajouter() {
        var table = document.getElementById("dataTable");
        var newRow = table.insertRow(table.rows.length);

        var cells = [];
        for (var i = 0; i < 6; i++) {
            cells[i] = newRow.insertCell(i);
        }

        cells[0].innerHTML = document.getElementById("id").value;
        cells[1].innerHTML = document.getElementById("nom").value;
        cells[2].innerHTML = document.getElementById("description").value;
        cells[3].innerHTML = document.getElementById("dateDebut").value;
        cells[4].innerHTML = document.getElementById("dateFin").value;
        cells[5].innerHTML = document.getElementById("statut").value;

        var actionsCell = newRow.insertCell(6);
        actionsCell.innerHTML = "<button onclick='modifier(this)'>Modifier</button> <button onclick='supprimer(this)'>Supprimer</button>";

        // Réinitialiser le formulaire
        document.getElementById("myForm").reset();
    }

    function supprimer(button) {
        var row = button.parentNode.parentNode;
        row.parentNode.removeChild(row);
    }

    function modifier(button) {
        var row = button.parentNode.parentNode;
        document.getElementById("id").value = row.cells[0].innerHTML;
        document.getElementById("nom").value = row.cells[1].innerHTML;
        document.getElementById("description").value = row.cells[2].innerHTML;
        document.getElementById("dateDebut").value = row.cells[3].innerHTML;
        document.getElementById("dateFin").value = row.cells[4].innerHTML;
        document.getElementById("statut").value = row.cells[5].innerHTML;

        // Supprimer la ligne après avoir récupéré les données pour la modification
        supprimer(button);
    }
</script>

</body>
</html>
