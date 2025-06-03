document.addEventListener('DOMContentLoaded', () => {
    const form = document.querySelector('form');
    const inputs = form.querySelectorAll('input[type="text"]');
    const checkbox = form.querySelector('input[type="checkbox"]');
    const errorDiv = document.querySelector('.error_message');

    const successSection = document.querySelector('.success');
    const fullName = document.querySelector('.fullName');
    const street = document.querySelector('.street');
    const houseNumber = document.querySelector('.houseNumber');
    const postCode = document.querySelector('.postCode');

    form.addEventListener('submit', (e) => {
        e.preventDefault();
        errorDiv.innerHTML = '';
        let errorPresent = false;

        if (isNaN(inputs[2].value) || inputs[2].value === '') {
            const error = document.createElement('p');
            error.innerHTML = 'Invalid House Number';
            errorDiv.appendChild(error);
            errorPresent = true;
        }

        if (inputs[3].value.length !== 6) {
            const error = document.createElement('p');
            error.innerHTML = 'Wrong postal code';
            errorDiv.appendChild(error);
            errorPresent = true;
        }

        if (!checkbox.checked) {
            const error = document.createElement('p');
            error.innerHTML = 'Accept the terms & conditions';
            errorDiv.appendChild(error);
            errorPresent = true;
        }
        if (!errorPresent) {
            fullName.textContent = inputs[0].value;
            street.textContent = inputs[1].value;
            houseNumber.textContent = inputs[2].value;
            postCode.textContent = inputs[3].value;
            successSection.classList.remove('hide');
            successSection.style.display = 'block';
            form.classList.add('hide');
        }
    });
});