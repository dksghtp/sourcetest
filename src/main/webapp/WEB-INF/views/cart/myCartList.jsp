<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<%@include file="../includes/header.jsp"%>

<!-- Breadcrumb Start -->
<div class="container-fluid">
	<div class="row px-xl-5">
		<div class="col-12">
			<nav class="breadcrumb bg-light mb-30">
				<a class="breadcrumb-item text-dark" href="#">Home</a> <a
					class="breadcrumb-item text-dark" href="#">Shop</a> <span
					class="breadcrumb-item active">장바구니</span>
			</nav>
		</div>
	</div>
</div>
<!-- Breadcrumb End -->


<!-- Cart Start -->
<div class="container-fluid">
	<div class="row px-xl-5">
		<div class="col-lg-8 table-responsive mb-5">
			<table
				class="table table-light table-borderless table-hover text-center mb-0">
				<thead class="thead-dark">
					<tr>
						<th>상품명</th>
						<th>가격</th>
						<th>수량</th>
						<th>총 상품가격</th>
						<th>삭제</th>
					</tr>
				</thead>
				<tbody class="align-middle">
					<c:forEach var="item" items="${cartItems}">
						<tr>
							<td class="align-middle"><img src="${item.image}" alt=""
								style="width: 50px;"> ${item.productName}</td>
							<td class="align-middle">${item.price}</td>
							<td class="align-middle">
								<div class="input-group quantity mx-auto" style="width: 100px;">
									<div class="input-group-btn">
										<form action="/cart/updateQuantity" method="post">
											<input type="hidden" name="productId"
												value="${item.productId}">
											<button class="btn btn-sm btn-primary btn-minus"
												type="submit">
												<i class="fa fa-minus"></i>
											</button>
										</form>
									</div>
									<input type="text"
										class="form-control form-control-sm bg-secondary border-0 text-center"
										name="quantity" value="${item.quantity}">
									<div class="input-group-btn">
										<form action="/cart/updateQuantity" method="post">
											<input type="hidden" name="productId"
												value="${item.productId}">
											<button class="btn btn-sm btn-primary btn-plus" type="submit">
												<i class="fa fa-plus"></i>
											</button>
										</form>
									</div>
								</div>
							</td>
							<td class="align-middle">${item.price * item.quantity}</td>
							<td class="align-middle">
								<form action="/cart/removeItem" method="post">
									<input type="hidden" name="productId" value="${item.productId}">
									<button class="btn btn-sm btn-danger" type="submit">
										<i class="fa fa-times"></i>
									</button>
								</form>
							</td>
						</tr>
					</c:forEach>
				</tbody>
			</table>
		</div>
		<div class="col-lg-4">
			<form class="mb-30" action="/cart/applyCoupon" method="post">
				<div class="input-group">
					<input type="text" class="form-control border-0 p-4"
						name="couponCode" placeholder="쿠폰">
					<div class="input-group-append">
						<button class="btn btn-primary" type="submit">쿠폰 적용</button>
					</div>
				</div>
			</form>
			<h5 class="section-title position-relative text-uppercase mb-3">
				<span class="bg-secondary pr-3">주문 예상금액</span>
			</h5>
			<div class="bg-light p-30 mb-5">
				<div class="border-bottom pb-2">
					<div class="d-flex justify-content-between mb-3">
						<h6>총 상품가격</h6>
						<h6>$150</h6>
					</div>
					<div class="d-flex justify-content-between">
						<h6 class="font-weight-medium">배송비</h6>
						<h6 class="font-weight-medium">3000원</h6>
					</div>
				</div>
				<div class="pt-2">
					<div class="d-flex justify-content-between mt-2">
						<h5>총 상품가격</h5>
						<h5>$160</h5>
					</div>
					<form action="/cart/checkOut" method="post">
						<input type="hidden" name="totalPrice" value="${totalPrice}">
						<button
							class="btn btn-block btn-primary font-weight-bold my-3 py-3"
							type="submit">주문하기</button>
					</form>
				</div>
			</div>
		</div>
	</div>
</div>
<!-- Cart End -->

<%@include file="../includes/footer.jsp"%>