
$('document').ready(function (){

    $('table #editButton').on('click', function (event){
        event.preventDefault();

        var href = $(this).attr('href');

        $.get(href, function (supplier, status){
            $('#txtIdEdit').val(supplier.id);
            $('#txtNameEdit').val(supplier.name);
            $('#txtDetailsEdit').val(supplier.details);
            $('#txtWebsiteEdit').val(supplier.website);
            $('#txtAddressEdit').val(supplier.address);
            $('#ddlStateEdit').val(supplier.stateid);
            $('#ddlCountryEdit').val(supplier.countryid);
            $('#txtCityEdit').val(supplier.city);
            $('#txtPhoneEdit').val(supplier.phone);
            $('#txtMobileEdit').val(supplier.mobile);
            $('#txtEmailEdit').val(supplier.email);
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