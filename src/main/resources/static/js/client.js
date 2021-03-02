
$('document').ready(function (){

    $('table #editButton').on('click', function (event){
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (client, status){
            $('#txtIdEdit').val(client.id);
            $('#txtNameEdit').val(client.name);
            $('#txtDetailsEdit').val(client.details);
            $('#txtWebsiteEdit').val(client.website);
            $('#txtAddressEdit').val(client.address);
            $('#ddlStateEdit').val(client.stateid);
            $('#ddlCountryEdit').val(client.countryid);
            $('#txtCityEdit').val(client.city);
            $('#txtPhoneEdit').val(client.phone);
            $('#txtMobileEdit').val(client.mobile);
            $('#txtEmailEdit').val(client.email);
        });

        $('#editModal').modal();
    });

    $('.table #detailsButton').on('click',function(event) {
        event.preventDefault();
        var href= $(this).attr('href');
        $.get(href, function(country, status){
            $('#idDetails').val(country.id);
            $('#descriptionDetails').val(country.description);
            $('#codeDetails').val(country.code);
            $('#lastModifiedByDetails').val(country.lastModifiedBy);
            $('#lastModifiedDateDetails').val(country.lastModifiedDate.substr(0,19).replace("T", " "));
        });
        $('#detailsModal').modal();
    });

    $('table #deleteButton').on('click', function (event){
        event.preventDefault();

        var href = $(this).attr('href');

        $('#confirmDeleteButton').attr('href', href);

        $('#deleteModal').modal();
    })
});