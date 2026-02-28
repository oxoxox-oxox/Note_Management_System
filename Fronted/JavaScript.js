//remind of upload your note
document.getElementById('pdfUploadForm').addEventListener('submit', function (e) {
    e.preventDefault();
    const formData = new FormData(this);
    const submitBtn = this.querySelector('button[type="submit"]');

    //show the stats of loading
    submitBtn.disabled = true;
    submitBtn.textContent = 'Uploading...';

    //simulating the upload process(will be replaced with the backend request later)
    setTimeout(() => {
        submitBtn.disabaled = true;
        submitBtn.textContent = 'upload PDF file';
        alert('PDF file is uploaded successfully!');
    }, 2000);
});