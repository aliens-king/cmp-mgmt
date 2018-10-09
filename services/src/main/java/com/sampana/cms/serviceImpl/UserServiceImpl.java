package com.sampana.cms.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sampana.cms.constants.IConstants;
import com.sampana.cms.dto.UserDTO;
import com.sampana.cms.model.ResponseDTO;
import com.sampana.cms.model.User;
import com.sampana.cms.repository.UserRepository;
import com.sampana.cms.service.UserService;
import com.sampana.cms.utils.DateUtils;

@Service("userService")
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	ResponseDTO responseDTO = null;
	public ResponseDTO save(UserDTO userDTO) {
		if (userDTO != null) {
			User user=getUserObj(userDTO);
			user=userRepository.save(user);
		}
		return responseDTO;
	}
	private User getUserObj(UserDTO userDTO) {
		User  user=null;
		if(null !=userDTO) {
			user=new User();
			if(null !=userDTO.getId())
				user.setId(userDTO.getId());
			user.setCreatedAt(DateUtils.getDateObj(userDTO.getCreatedAt(), IConstants.DATE_FORMAT));
			//user.setDeleted(DateUtils.getDateObj(userDTO.getDeleted(), IConstants.DATE_FORMAT));
			user.setDeletedAt(DateUtils.getDateObj(userDTO.getDeletedAt(), IConstants.DATE_FORMAT));
			user.setEmail(userDTO.getEmail());
			user.setPassword(userDTO.getPassword());
			user.setFullName(userDTO.getFullName());
			user.setUpdatedAt(DateUtils.getDateObj(userDTO.getUpdatedAt(), IConstants.DATE_FORMAT));
			user.setUserName(userDTO.getUserName());
			user.setUserStatusId(userDTO.getUserStatusId());
		}
		return user;
	}

}
