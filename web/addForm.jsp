<form action="/add-book" method="post">
  <%-- названия книг --%>
  <div class="row mt-3">
    <div class="col-12">
      <label>NAME : </label>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <input type="text" class="form-control" name="book_name">
    </div>
  </div>
  <%-- названия автора --%>
  <div class="row mt-3">
    <div class="col-12">
      <label>AUTHOR : </label>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <input type="text" class="form-control" name="book_author">
    </div>
  </div>
  <%-- названия жанра --%>
  <div class="row mt-3">
    <div class="col-12">
      <label>GENRE : </label>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <select class="form-select" name="book_genre">
        <option>Fantasy</option>
        <option>Roman</option>
        <option>Horror</option>
      </select>
    </div>
  </div>
  <%-- цена книг --%>
  <div class="row mt-3">
    <div class="col-12">
      <label>PRICE : </label>
    </div>
  </div>
  <div class="row mt-2">
    <div class="col-12">
      <input type="text" class="form-control" name="book_price">
    </div>
  </div>
    <div class="row mt-3">
      <div class="col-12">
        <label>DESCRIPTION : </label>
      </div>
    </div>
    <div class="mt-3">
      <div class="col-12">
        <textarea name="book_description" class="form-control" rows="3"></textarea>
      </div>
    </div>
  <%-- кнопка --%>
  <div class="row mt-3">
    <div class="col-12">
      <button class="btn btn-success">ADD BOOK</button>
    </div>
  </div>
</form>