const DivisionController = {};

DivisionController.doDivision = async nums => {
    return await fetch('http://localhost:8081/api/operations/division', {
        method: 'POST',
        headers: {
            'Accept': 'application/json',
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(nums)
    })
    .then(response => response.json())
    .then(({data, message}) => {
        return data != null ? data : message;
    })
    .catch(console.log());
}

export default DivisionController;