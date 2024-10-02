package com.betrybe.agrix.service;

import com.betrybe.agrix.entity.Crop;
import com.betrybe.agrix.entity.Farm;
import com.betrybe.agrix.entity.Fertilizer;
import com.betrybe.agrix.repository.CropRepository;
import com.betrybe.agrix.repository.FarmRepository;
import com.betrybe.agrix.repository.FertilizerRepository;
import com.betrybe.agrix.service.exception.CropNotFoundException;
import com.betrybe.agrix.service.exception.FarmNotFoundException;
import com.betrybe.agrix.service.exception.FertilizerNotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The type Crop service.
 */
@Service
public class CropService {
  private final CropRepository cropRepository;
  private final FarmRepository farmRepository;
  private final FertilizerRepository fertilizerRepository;

  /**
   * Instantiates a new Crop service.
   *
   * @param cropRepository       the crop repository
   * @param farmRepository       the farm repository
   * @param fertilizerRepository the fertilizer repository
   */
  @Autowired
  public CropService(
      CropRepository cropRepository,
      FarmRepository farmRepository,
      FertilizerRepository fertilizerRepository) {
    this.cropRepository = cropRepository;
    this.farmRepository = farmRepository;
    this.fertilizerRepository = fertilizerRepository;
  }

  /**
   * Find by id crop.
   *
   * @param id the id
   * @return the crop
   * @throws FarmNotFoundException the farm not found exception
   */
  public Crop findById(Long id) throws FarmNotFoundException {
    return cropRepository.findById((id)).orElseThrow(CropNotFoundException::new);
  }

  /**
   * Find all list.
   *
   * @return the list
   */
  public List<Crop> findAll() {
    return cropRepository.findAll();
  }

  /**
   * Create crop.
   *
   * @param farmId the farm id
   * @param crop   the crop
   * @return the crop
   */
  public Crop create(Long farmId, Crop crop) {
    Farm farm = farmRepository.findById(farmId).orElseThrow(FarmNotFoundException::new);

    crop.setFarm(farm);
    return cropRepository.save(crop);
  }

  /**
   * Update crop crop.
   *
   * @param id   the id
   * @param crop the crop
   * @return the crop
   * @throws CropNotFoundException the crop not found exception
   */
  public Crop updateCrop(Long id, Crop crop) throws CropNotFoundException {
    Crop cropFromDb = findById(id);
    cropFromDb.setId(crop.getId());
    cropFromDb.setName(crop.getName());
    cropFromDb.setPlantedArea(crop.getPlantedArea());

    return cropRepository.save(cropFromDb);
  }

  /**
   * Delete by id crop.
   *
   * @param id the id
   * @return the crop
   * @throws CropNotFoundException the crop not found exception
   */
  public Crop deleteById(Long id) throws CropNotFoundException {
    Crop crop = findById(id);
    cropRepository.deleteById(id);
    return crop;
  }

  /**
   * Gets crops by harvest period.
   *
   * @param startDate the start date
   * @param endDate   the end date
   * @return the crop by harvest period
   */
  public List<Crop> getCropByHarvestPeriod(LocalDate startDate, LocalDate endDate) {
    return cropRepository.findByHarvestDateBetween(startDate, endDate);
  }

  /**
   * Associate crop to fertilizer crop.
   *
   * @param cropId       the crop id
   * @param fertilizerId the fertilizer id
   * @return the crop
   * @throws CropNotFoundException       the crop not found exception
   * @throws FertilizerNotFoundException the fertilizer not found exception
   */
  public Crop associateCropToFertilizer(Long cropId, Long fertilizerId) throws
        CropNotFoundException,
        FertilizerNotFoundException {
    Crop crop = findById(cropId);
    if (crop == null) {
      throw  new CropNotFoundException();
    }
    Fertilizer fertilizer = fertilizerRepository.findById(fertilizerId).orElse(null);
    if (fertilizer == null) {
      throw new FertilizerNotFoundException();
    }
    if (crop.getFertilizers() == null) {
      crop.setFertilizers(new ArrayList<>());
    }
    crop.getFertilizers().add(fertilizer);

    return cropRepository.save(crop);
  }


}
